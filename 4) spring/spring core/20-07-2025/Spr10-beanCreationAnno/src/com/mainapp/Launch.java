package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
	
	private static AnnotationConfigApplicationContext ac;

	public static void main(String[] args) {
		ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Employee bean = (Employee) ac.getBean("emp");
//		System.out.println(bean);
		Employee bean1 = ac.getBean(Employee.class);
		System.out.println(bean1);
		
		ac.close();
	}
}