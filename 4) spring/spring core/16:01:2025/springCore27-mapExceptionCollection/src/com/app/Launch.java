package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e = (Employee)cac.getBean("emp");
		e.setId(11);
		e.setName("Raju");
		e.setAddress("Patna");
		
		
		System.out.println(e);
		System.out.println(e.getMapOfAccounts().getClass());
		
		
		
		
//		cac.close();
	}
}


