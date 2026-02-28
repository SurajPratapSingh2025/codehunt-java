package com.mainapp;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Manager implements InitializingBean, DisposableBean{
	
	static {
		System.out.println("Manager bean loading ");
	}
	public Manager() {
		System.out.println("Manager bean instatiation with zero-arg");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Manager bean initialization");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Manager bean destroy");
	}
}
