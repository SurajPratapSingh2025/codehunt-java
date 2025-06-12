package com.springCore.BeanInheritance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springCore.BeanInheritance.config.MyConfiguration;
import com.springCore.test.Meta;

public class Launch {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfiguration.class);
		
//		Google g1 = ac.getBean(Google.class);
//		g1.setId(1000);
//		g1.printMyData();
//		
//		Google g2 = ac.getBean(Google.class);
//		g2.printMyData();
		
		
		Google g1 = ac.getBean(Google.class);
		Meta g2 = ac.getBean(Meta.class);
		
		ac.close();
	}
}
