package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	static {
		System.out.println("Student bean loading ");
	}
	public Student() {
		System.out.println("Student bean instatiation with zero-arg");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Student bean initialization");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Student bean destroy");
	}
}
