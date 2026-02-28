package com.mainapp;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Launch {
	
	private static AnnotationConfigApplicationContext ac;

	public static void main(String[] args) {
		ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
//		Employee bean = (Employee) ac.getBean("emp");
//		System.out.println(bean);
		Employee bean1 = ac.getBean(Employee.class);
		System.out.println(bean1.getId());
		
		System.out.println(bean1.getCar().getPrice());
		System.out.println(bean1.getCar().getModel());
		
		System.out.println(bean1.getBooks());
		
		Map<String,String> books = bean1.getBooks();
		for(Entry<String, String> s:books.entrySet())
		{
			System.out.print(s.getKey()+"\t");
			System.out.println(s.getValue());
		}
		
		ac.close();
	}
}