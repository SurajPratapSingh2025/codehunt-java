package com.springCore.Autowired;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.Autowired.config.MyConfig;
import com.springCore.Autowired.controller.MyController;
import com.springCore.Autowired.dto.StudentDTO;

public class Launch {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac=new AnnotationConfigApplicationContext(MyConfig.class);
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter Student id: ");
		int sid=obj.nextInt();
		obj.nextLine();
		System.out.println("Enter Student Name: ");
		String sname=obj.nextLine();
		System.out.println("Enter Student Address: ");
		String saddress=obj.nextLine();
		System.out.println("Enter Student Salary: ");
		int salary=obj.nextInt();
		
		//DTO Model
		StudentDTO studentDTO=new StudentDTO(sid,sname,saddress,salary);
		
		MyController controller = ac.getBean(MyController.class);
		controller.doPost(studentDTO);
	}
}
