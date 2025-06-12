package com.app;

public class EmpBean {
	
	static {
		System.out.println("Bean Loading");
	}
	public EmpBean() {
		System.out.println("Bean Instantiation");
	}
	public void myXmlInit() {					//custom init
		System.out.println("Bean Allocation");
	}
	public void test() {
		System.out.println("Bean Custom Method");
	}
	public void myXmlDestroy() {				//custom destroy
		System.out.println("Bean Deallocation");
	}
}
