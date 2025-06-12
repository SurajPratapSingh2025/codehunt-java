package com.springCore.BeanLifeCycle.CallBack;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	static {
		System.out.println("bean loading");
	}
	private Student() {
		System.out.println("bean instantiation");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("resources allocation");
		
	}
	public void getInfo() {
		System.out.println("custom method");
	}
	
	@Override
	public void destroy() throws Exception {
		System.out.println("resources deallocation");
		
	}
}
