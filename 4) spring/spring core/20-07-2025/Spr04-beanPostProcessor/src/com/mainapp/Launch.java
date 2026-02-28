package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
	}
}
