package com.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Launch {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext cac = new ClassPathXmlApplicationContext("bean.xml");
//		ClassPathResource resource = new ClassPathResource("bean.xml");
//		XmlBeanFactory xbf = new XmlBeanFactory(resource);
		
//		Demo demo = (Demo) cac.getBean("demo");
		Demo demo = cac.getBean("demo", Demo.class); // No typecast needed
//		demo.test();
		int val=demo.test();
		
		if(val==1000) {								//conditional femo
			Femo femo = (Femo) cac.getBean("femo");
			femo.test();
		}
		
		
		System.out.println("Exit");
	}
}

