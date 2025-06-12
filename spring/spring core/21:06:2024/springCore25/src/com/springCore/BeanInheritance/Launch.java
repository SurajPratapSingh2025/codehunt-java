package com.springCore.BeanInheritance;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
		Google google = (Google)ac.getBean("google");
		System.out.println(google);
		
		Meta meta = (Meta)ac.getBean("meta");
		System.out.println(meta);
		
	}
}
