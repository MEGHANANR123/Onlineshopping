package com.dxc.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class admin {
@Override
public String toString() {
	return "admin [adminid=" + adminid + ", password=" + password + "]";
}
@Id
private String adminid;
private String password;
public admin()
{
	
}
public admin(String adminid, String password) {
	super();
	this.adminid = adminid;
	this.password = password;
}
public String getAdminid() {
	return adminid;
}
public void setAdminid(String adminid) {
	this.adminid = adminid;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
 
}
