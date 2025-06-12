package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.MyConfig;

public class Launch {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		
		AnnotationConfigApplicationContext aac = new AnnotationConfigApplicationContext(MyConfig.class);
		
		Employee bean = aac.getBean(Employee.class);
		bean.test();
		aac.close();
		
//		Employee bean1 = aac.getBean(Employee.class);
//		bean1.test();
		
//		aac.close();
	}
}


