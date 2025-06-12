package com.app;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.app.controller.Controller;
import com.app.dao.Dao;
import com.app.service.MyService;

public class BeanPostProcessorImpl implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Post Before Initialization");
		if(bean instanceof Controller) {
			System.out.println("Controller Instantiation with id: "+beanName);
		}else if(bean instanceof MyService){
			System.out.println("Service Instantiation with id: "+beanName);
		}else {
			System.out.println("DAO Instantiation with id: "+beanName);
		}
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		
		System.out.println("Post After Initialization");
		if(bean instanceof Controller) {
			System.out.println("Controller Instantiation Successfully");
		}else if(bean instanceof MyService){
			System.out.println("Service Instantiation Successfully");
		}else {
			Dao dao=(Dao)bean;
			String result = dao.init();
			if(result==null) {
				System.out.println("DAO Failed to Instantiation");
			}
			else if(result.equals("Connection Estabilished")) {
				System.out.println("DAO Instantiation Successfully");
			}else {
				System.out.println("DAO Failed to Instantiation");
			}
			
		}
		return bean;
	}
	
	
}
