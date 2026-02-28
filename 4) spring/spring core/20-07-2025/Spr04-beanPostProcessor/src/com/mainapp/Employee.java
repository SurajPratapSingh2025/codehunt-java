package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	static {
		System.out.println("Employee bean loading ");
	}
	public Employee() {
		System.out.println("Employee bean instatiation with zero-arg");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee bean initialization");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Employee bean destroy");
	}
}
