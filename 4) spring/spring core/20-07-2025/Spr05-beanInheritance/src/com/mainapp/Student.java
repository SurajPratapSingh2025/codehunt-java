package com.mainapp;

public class Student{
	
	private int code;
	private String name;
	private int sid;
	
	static {
		System.out.println("Student bean loading ");
	}
	public Student() {
		System.out.println("Student bean instatiation with zero-arg");
	}
	@Override
	public String toString() {
		return "Student [code=" + code + ", name=" + name + ", sid=" + sid + "]";
	}
	public Student(int code, String name, int sid) {
		super();
		this.code = code;
		this.name = name;
		this.sid = sid;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
}
