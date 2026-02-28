package com.mainapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		Crud bean = (Crud) ac.getBean("crud");
		
//		bean.insert(11,"mayank1","mca1",222231,"patna1 science collge","patna1");
		
		bean.readAll();
//		bean.readAllPojoBased();
//		bean.readSingleData(22);
//		
//		bean.update(22, "suraj", "mca", 18000,"psc" , "kumhrar");
//		bean.delete(12);
		
	}
}