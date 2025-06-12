package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyConfig;
import com.app.controller.MyController;
import com.app.entity.Employee;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee emp = aac.getBean(Employee.class);
		emp.setEid(11);
		emp.setEname("Raju");
		emp.setEaddress("patna");
		emp.setEsalary(1000);
		
		MyController cont = aac.getBean(MyController.class);
		String res = cont.doPost(emp);
		System.out.println(res);
		
		
//		System.out.println(emp);
		
		
	}
}