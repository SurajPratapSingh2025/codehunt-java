package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee bean = (Employee) classPathXmlApplicationContext.getBean("emp");
		System.out.println("Bank Name: "+bean.getBank());
		System.out.println("Collection Type: "+bean.getBank().getClass());
	}
}