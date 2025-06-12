package com.springCore.BeanInstantiation.StaticFactory;

public class Student {
	public Student() {
		System.out.println("Bean Instantiation");
	}
	public static Student getObj() {	//loosely couple
		System.out.println("business logic");
		return new Student();
	}
	public void getInfo() {
		System.out.println("custom method");
	}
}
