package com.mainapp;

public class Employee {
	//dependency inject
	private String id;
	static {
		System.out.println("bean loading ");
	}
	public Employee() {
		System.out.println("bean instatiation with zero-arg");
	}
	//constructor-arg
	public Employee(String id) {
		super();
		this.id = id;
		System.out.println("bean instatiation with one-arg");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
