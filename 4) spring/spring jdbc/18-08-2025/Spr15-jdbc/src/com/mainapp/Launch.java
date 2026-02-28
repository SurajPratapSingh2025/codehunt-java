package com.mainapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext cpxml = new ClassPathXmlApplicationContext("bean.xml");
		Crud bean = (Crud) cpxml.getBean("crud");
		
//		bean.insert(11,"mayank1","mca1",222231,"patna1 science collge","patna1");
		
//		bean.readAll();
		bean.readAllPojoBased();
//		bean.readSingleData(22);
//		
//		bean.update(22, "suraj", "mca", 18000,"psc" , "kumhrar");
//		bean.delete(22);
		
	}
}