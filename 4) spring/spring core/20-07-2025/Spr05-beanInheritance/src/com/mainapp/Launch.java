package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		System.out.println(classPathXmlApplicationContext.getBean("emp").toString());
		System.out.println(classPathXmlApplicationContext.getBean("stu").toString());
		System.out.println(classPathXmlApplicationContext.getBean("man").toString());
		
	}
}
