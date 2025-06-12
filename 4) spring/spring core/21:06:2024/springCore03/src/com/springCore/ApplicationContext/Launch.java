package com.springCore.ApplicationContext;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		System.out.print("Enter Key: ");
		Scanner obj=new Scanner(System.in);
		int key=obj.nextInt();
		
		
		//emp
		Employee emp = (Employee) context.getBean("emp");
		emp.getInfo();
		
		//man
		Manager man = (Manager) context.getBean("man");
		man.getInfo();
		
		
		if(key==1234) {
			//std
			Student std = (Student) context.getBean("std");
			std.getInfo();
		}else {
			System.out.println("Wrong User");
		}
		
	}
}
