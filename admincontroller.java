package com.dxc.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.dxc.pojos.*;
import com.dxc.pojos.product;
import com.dxc.services.adminservice;
import java.util.List;
@Controller
@RequestMapping("/views")
public class admincontroller {
adminservice service=new adminservice();
String status=" ";
@RequestMapping("/add")
public String add(@ModelAttribute admin a)
{
	service.addadmin(a);
	return "message";
}
@RequestMapping("/login")
public String login(@ModelAttribute admin a, Model m)
{
	boolean b=service.loginadmin(a);
	if (b)
	{
		return "adminoptions";
	}
	else
	{
		status="incorrect login credentials";
		m.addAttribute("status",status);
		return "message1";
	}
}
@RequestMapping("/addproduct")
public String addproduct(@ModelAttribute product p)
{
	service.addproduct(p);
	return "message2";
}
@RequestMapping("/displayproduct")
public String getallproducts(Model m)
{
	List<product> list=service.getallproducts();
	m.addAttribute("list",list);
	return "displayproduct";
}
@RequestMapping("/addcustomer")
public String addproduct(@ModelAttribute customer c)
{
	service.addcustomer(c);
	return "message3";
}
@RequestMapping("/removecustomer")
public String removecustomer(@ModelAttribute customer c)
{
	int i=c.getCustomerid();
	service.removecustomer(i);
	return "message4";
}
@RequestMapping("/find")
public String find(@RequestParam("customerid") int customerid, Model m,HttpSession session)
{
	boolean status=true;
	session.setAttribute("customerid",customerid);
	
	status=service.findcustomer(customerid);
	String msg;
	if(status==false)
	{
		return "message5";
		
	}
	else
	{
		return "removecustomer";
		
	}
}
}