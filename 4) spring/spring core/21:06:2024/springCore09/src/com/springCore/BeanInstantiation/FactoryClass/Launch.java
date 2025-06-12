package com.springCore.BeanInstantiation.FactoryClass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		Student std = (Student)ac.getBean("std");
		
		std.getInfo();
		ac.close();
	}
}
