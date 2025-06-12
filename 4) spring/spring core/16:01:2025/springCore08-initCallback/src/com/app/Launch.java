package com.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
		
//		EmpBean emp = (EmpBean)cac.getBean("emp");
//		emp.test();
		
		EmpBean emp1 = (EmpBean)cac.getBean("emp");
		emp1.test();
		
		EmpBean emp2 = (EmpBean)cac.getBean("emp");
		emp2.test();
		
		EmpBean emp3 = (EmpBean)cac.getBean("emp");
		emp3.test();
		
		
//		cac.close();
		emp2.destroy();
	}
}
