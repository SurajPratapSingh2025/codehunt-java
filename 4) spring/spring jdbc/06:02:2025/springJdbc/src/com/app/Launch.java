package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.repository.Crud;

public class Launch {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		Crud crud = cac.getBean("crud",Crud.class);
//		crud.insert(20, "dhanu");
//		crud.delete(1);
//		crud.update(28, "boy");
		crud.readAllDefault();
//		crud.readAllPojo();
//		crud.readSingle(20);
	}
}
