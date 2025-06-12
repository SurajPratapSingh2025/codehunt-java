package com.springCore.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
//		new Student();	//error by tight coupling
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Student bean = (Student) ac.getBean("std");
		
		
		
	}
}
