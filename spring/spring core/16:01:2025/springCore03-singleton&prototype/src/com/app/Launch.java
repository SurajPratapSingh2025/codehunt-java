package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		//raju
		System.out.println("Raju Account Creation");
		Account acc1 = (Account) cac.getBean("acc");
		acc1.setUsername("Raju123");
		acc1.setPasword("123456");
		acc1.setFullname("RAJU");
		acc1.setAddress("Mumbai");
		System.out.println(acc1);
		
		
		
		//kaju
		System.out.println("Kaju Account Creation");
		Account acc = (Account) cac.getBean("acc");
		acc.setUsername("Kaju123");
		acc.setPasword("654321");
		acc.setFullname("KAJU");
		acc.setAddress("Bumbai");
		System.out.println(acc);
		
		System.out.println("...........Both Account Details............");
		System.out.println(acc1);
		System.out.println(acc);
		
	}
}
