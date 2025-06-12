package com.springCore.BeanInheritance;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Lazy
//@Scope(value="prototype")
public class Google {
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("resource allocation");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("resource deallocation");
	}
	
	static {
		System.out.println("Google bean loading....");
	}
	public Google() {
		System.out.println("Google bean instantiation");
	}
	
	public void printMyData() {
		System.out.println("ID= "+id);
	}
	
	
}
