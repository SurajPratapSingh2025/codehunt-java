package com.mainapp;

public class Employee{
	
	private int code;
	private String name;
	private int eid;
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Employee [code=" + code + ", name=" + name + ", eid=" + eid + "]";
	}
	public Employee(int code, String name, int eid) {
		super();
		this.code = code;
		this.name = name;
		this.eid = eid;
	}
}
