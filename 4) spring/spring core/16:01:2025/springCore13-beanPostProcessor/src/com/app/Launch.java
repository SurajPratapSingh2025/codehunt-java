package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.controller.Controller;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
		Controller c = (Controller)cac.getBean("controller");
		c.doPost();
		
		cac.close();
	}
}
