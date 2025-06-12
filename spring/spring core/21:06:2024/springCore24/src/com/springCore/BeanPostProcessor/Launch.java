package com.springCore.BeanPostProcessor;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springCore.BeanPostProcessor.controller.MyController;
import com.springCore.BeanPostProcessor.dto.StudentDTO;

public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		
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
		
		MyController controller = (MyController)ac.getBean("controller");
		controller.doPost(studentDTO);
	}
}
