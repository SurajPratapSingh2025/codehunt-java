package com.springCore.SetterDI;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Student std = (Student)ac.getBean("std");
		
		System.out.println(std.getDriverName().getClass());
		System.out.println(std);
	}
}
