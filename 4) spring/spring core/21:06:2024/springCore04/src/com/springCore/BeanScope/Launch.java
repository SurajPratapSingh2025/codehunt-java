package com.springCore.BeanScope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		Student std1 = (Student)ac.getBean("std");
		
		std1.setSid(28);
		std1.setSname("sps");
		
		std1.getInfo();
		
		Student std2 = (Student)ac.getBean("std");
		std2.getInfo();
		
		
	}
}
