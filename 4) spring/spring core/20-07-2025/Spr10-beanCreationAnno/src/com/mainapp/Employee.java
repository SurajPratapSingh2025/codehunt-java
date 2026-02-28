package com.mainapp;

//@Component("emp")
//@Lazy
//@Scope("prototype")
public class Employee{
	
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	
//	@PostConstruct
	public void annoInit() {
		System.out.println("Employee Initialization");
	}
//	@PreDestroy
	public void annoDestroy() {
		System.out.println("Employee Destroy");
	}
	
	
}
