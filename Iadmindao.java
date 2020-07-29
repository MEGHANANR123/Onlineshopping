package com.dxc.dao;
import java.util.List;
import com.dxc.pojos.*;

public interface Iadmindao {
public boolean loginadmin(admin a);
public void addadmin(admin a);
public void addproduct(product p);
List<product> getallproducts();
public void addcustomer(customer c);
public void removecustomer(int i);
public boolean findcustomer(int customerid);
}
