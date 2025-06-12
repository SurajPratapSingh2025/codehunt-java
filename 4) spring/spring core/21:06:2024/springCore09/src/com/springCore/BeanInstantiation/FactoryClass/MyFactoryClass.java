package com.springCore.BeanInstantiation.FactoryClass;

public class MyFactoryClass {
	public Student getObj1() {
		System.out.println("business logic 1");
		//Scanner
		//if else
		//key
		return new Student();
	}
	public Student getObj2() {
		System.out.println("business logic 2");
		//Scanner
		//if else
		//key
		return new Student();
	}
}
