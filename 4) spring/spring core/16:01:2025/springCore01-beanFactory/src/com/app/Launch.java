package com.app;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Launch {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		ClassPathResource resource = new ClassPathResource("bean.xml");
		XmlBeanFactory xbf = new XmlBeanFactory(resource);
		
//		Demo demo = (Demo) xbf.getBean("demo");
		Demo demo = xbf.getBean("demo", Demo.class); // No typecast needed
		demo.test();
		
		Femo femo = (Femo) xbf.getBean("femo");
		femo.test();
		
		System.out.println("Exit");
	}
}

