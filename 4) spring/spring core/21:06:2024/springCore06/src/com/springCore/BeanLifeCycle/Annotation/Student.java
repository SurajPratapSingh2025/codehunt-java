package com.springCore.BeanLifeCycle.Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	static {
		System.out.println("bean loading");
	}
	private Student() {
		System.out.println("bean instantiation");
	}
	
	@PostConstruct
	public void myXmlInit() {
		System.out.println("resources allocation");
	}
	public void getInfo() {
		System.out.println("custom method");
	}
	@PreDestroy
	public void myXmlDestroy() {
		System.out.println("resources deallocation");
	}
}
