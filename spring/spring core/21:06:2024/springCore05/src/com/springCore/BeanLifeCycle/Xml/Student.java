package com.springCore.BeanLifeCycle.Xml;

public class Student {
	static {
		System.out.println("student bean loading");
	}
	private Student() {
		System.out.println("resouces allocation");
	}
	public void myXmlInit() {
		System.out.println("bean initialization");
	}
	public void getInfo() {
		System.out.println("custom method");
	}
	public void myXmlDestroy() {
		System.out.println("resources deallocation");
	}
}
