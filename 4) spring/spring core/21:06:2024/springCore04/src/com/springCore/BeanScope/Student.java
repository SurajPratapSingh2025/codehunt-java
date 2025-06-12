package com.springCore.BeanScope;

public class Student {
	private int sid;
	private String sname;
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	private Student() {
		System.out.println("no arg Constructor- Student");
	}
	public void getInfo() {
		System.out.println("Student info.........");
		System.out.println("Student id= "+sid);
		System.out.println("Student Name= "+sname);
	}
}
