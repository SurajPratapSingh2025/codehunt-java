package com.mainapp;

import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("unused")
	private static ClassPathXmlApplicationContext classPathXmlApplicationContext;

	public static void main(String[] args) {
		classPathXmlApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
		Employee bean = (Employee) classPathXmlApplicationContext.getBean("emp");
		
		System.out.println("Bank Name: "+bean.getBank());
		
		Map<Tv, Freez> map = bean.getBank();
		
		for (Map.Entry<Tv, Freez> entry : map.entrySet()) {
            System.out.println("TV Object  : " + entry.getKey().getShow());
            System.out.println("Freez Obj  : " + entry.getValue().getCloth());
        }
		System.out.println("Collection Type: "+bean.getBank().getClass());
	}
}