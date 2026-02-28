package com.mainapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean{
	
	static {
		System.out.println("bean loading ");
	}
	public Employee() {
		System.out.println("bean instatiation with zero-arg");
	}
//	public void xmlInit() {
//		System.out.println("bean intialization");
//	}
//	public void xmlDestroy() {
//		System.out.println("bean destory");
//	}
	
//	@PostConstruct
//	public void annoInit() {
//		System.out.println("bean intialization");
//	}
//	@PreDestroy
//	public void annoDestroy() {
//		System.out.println("bean destroy");
//	}

	@Override
	public void destroy() throws Exception {
		System.out.println("bean destroy");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("bean initialization");
	}
}
