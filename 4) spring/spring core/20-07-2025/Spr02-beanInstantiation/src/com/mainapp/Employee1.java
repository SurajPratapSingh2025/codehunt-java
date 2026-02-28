package com.mainapp;

import java.util.UUID;

public class Employee1 {
	//dependency inject
	private String id;
	static {
		System.out.println("bean loading ");
	}
	public Employee1() {
		System.out.println("bean instatiation with zero-arg");
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public static Employee1 getObject() {
		Employee1 employee1 = new Employee1();
		employee1.setId(UUID.randomUUID().toString());
		return employee1;
	}
}
