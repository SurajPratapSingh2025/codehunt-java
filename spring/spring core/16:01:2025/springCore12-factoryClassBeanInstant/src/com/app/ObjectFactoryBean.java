package com.app;

import java.util.Scanner;

public class ObjectFactoryBean {
	
	@SuppressWarnings("resource")
	public EmpBean customObject() {			//static factory method
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Key: ");
		
		EmpBean empBean;
		int key=scanner.nextInt();
		if(key==1212) {
			empBean=new EmpBean("QWERTY");
		}else {
			empBean=new EmpBean("PQRS");
		}
		return empBean;
	}
}
