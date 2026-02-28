package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee2 bean = (Employee2) classPathXmlApplicationContext.getBean("emp");
		System.out.println(bean.getId());
		System.out.println(bean.getAccount());
		System.out.println(bean.getAccount().getAn());
		System.out.println(bean.getAccount().getBank());
	}
}
