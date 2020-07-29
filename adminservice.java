package com.dxc.services;

import com.dxc.dao.admindao;
import com.dxc.pojos.*;
import java.util.List;

public class adminservice implements Iadminservice{
	admindao dao=new admindao();

	public boolean loginadmin(admin a) {
		return dao.loginadmin(a);
	}
public void addadmin(admin a) {
	dao.addadmin(a);
}
public void addproduct(product p) {
	dao.addproduct(p);
}
public List<product> getallproducts() {
	return dao.getallproducts();
}
public void addcustomer(customer c) {
	dao.addcustomer(c);
}
public void removecustomer(int i) {
	dao.removecustomer(i);
}
public boolean findcustomer(int customerid) {
	return dao.findcustomer(customerid);
}
}
