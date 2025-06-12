package com.app;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Lazy
//@Scope("prototype")
//@Scope(scopeName="prototype")
public class Employee {
	
	static {
		System.out.println("Bean Loading");
    }
	public Employee(){
		System.out.println("Bean Instantiation");
	}
	@PostConstruct
	public void init() {
		System.out.println("Bean init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("Bean destroy");
	}
	public void test() {
		System.out.println("Method Called");
	}
	
}
    
    
    
    
    
    
    
    
