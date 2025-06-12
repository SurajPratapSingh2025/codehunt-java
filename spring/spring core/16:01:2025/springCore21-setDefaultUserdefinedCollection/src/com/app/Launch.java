package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e = (Employee)cac.getBean("emp");
		e.setEid(11);
		e.setEname("Raju");
		e.setEaddress("Patna");
		
		
		System.out.println(e);
		System.out.println(e.getSetOfAccounts().getClass());
		
		
		
		
//		cac.close();
	}
}


