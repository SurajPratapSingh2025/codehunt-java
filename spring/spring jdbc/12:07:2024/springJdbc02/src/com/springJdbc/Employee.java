package com.springJdbc;

public class Employee {
	
	private int eid;
	private String ename;
	
	public void setEid(int eid) {
		this.eid = eid;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	public int getEid() {
		return eid;
	}
	public String getEname() {
		return ename;
	}
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
	
	
	
}
