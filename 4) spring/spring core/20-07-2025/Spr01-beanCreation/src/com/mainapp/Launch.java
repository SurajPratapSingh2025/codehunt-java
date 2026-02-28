package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

@SuppressWarnings("deprecation")
public class Launch {
	public static void main(String[] args) {
//		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));	//lazy loading
//		Emp e = (Emp) xmlBeanFactory.getBean("emp");
//		System.out.println(e);
//		e.test();
		
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");	//eager loading
		System.out.println(classPathXmlApplicationContext);
		Emp e = (Emp) classPathXmlApplicationContext.getBean("emp");
		e.test();
		
	}
}
