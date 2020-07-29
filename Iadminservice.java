package com.dxc.services;

import java.util.List;


import com.dxc.pojos.*;
import com.dxc.pojos.product;

public interface Iadminservice {
	public boolean loginadmin(admin a);
	public void addadmin(admin a);
	public void addproduct(product p);
	List<product> getallproducts();
	public void addcustomer(customer c);
	public void removecustomer(int i);
	public boolean findcustomer(int customerid);
	
}
