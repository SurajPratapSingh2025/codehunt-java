package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
		Employee e = (Employee)cac.getBean("employee");
		e.setEid(11);
		e.setEname("Raju");
		
		Student s = (Student)cac.getBean("student");
		s.setRoll(28);
		s.setSname("Suraj");
		
		Client c = (Client)cac.getBean("client");
		c.setCid(30);
		c.setCname("Deepak");
		
		System.out.println(e);
		System.out.println(s);
		System.out.println(c);
		
		cac.close();
	}
}
