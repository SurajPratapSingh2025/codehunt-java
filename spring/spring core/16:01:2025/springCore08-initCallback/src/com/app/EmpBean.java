package com.app;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmpBean implements InitializingBean,DisposableBean{
	
	static {
		System.out.println("Bean Loading");
	}
	public EmpBean() {
		System.out.println("Bean Instantiation");
	}
//	public void myXmlInit() {					//custom init
//		System.out.println("Bean Allocation");
//	}
//	@PostConstruct
//	public void myAnnoInit() {					//custom init
//		System.out.println("Bean Allocation");
//	}
	@Override
	public void afterPropertiesSet() throws Exception{	//init method for callback
		System.out.println("Bean Allocation");
	}
	public void test() {
		System.out.println("Bean Custom Method");
	}
//	public void myXmlDestroy() {				//custom destroy
//		System.out.println("Bean Deallocation");
//	}
//	@PreDestroy
//	public void myAnnoDestroy() {				//custom destroy
//		System.out.println("Bean Deallocation");
//	}
	@Override
	public void destroy() throws Exception{		//destroy method for callback
		System.out.println("Bean Deallocation");
	}
}
