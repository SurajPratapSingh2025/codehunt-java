package com.springJdbc;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Launch {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
		
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter eid: ");
		int eid=obj.nextInt();
//		System.out.println("Enter ename: ");
//		String ename=obj.next();
		
		Crud bean = (Crud)ac.getBean("crud");
		
//		bean.insertMyData(eid, ename);	//insert
		
//		bean.updateMyData(eid, ename);	//update
		
//		bean.deleteMyData(eid);			//delete
		
//		bean.readMyData1();
		
//		bean.readMyData2();
		
		bean.readMyData3(eid);
	}
}
