package com.springCore.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ClassPathResource resource = new ClassPathResource("bean.xml");
		XmlBeanFactory bf=new XmlBeanFactory(resource);
		
		Student std = (Student)bf.getBean("std");
		
		
	}
}
