package com.springCore.Autowired.postProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.springCore.Autowired.controller.MyController;
import com.springCore.Autowired.dao.Crud;
import com.springCore.Autowired.service.MyService;

public class BeanPostProcessorImpl implements BeanPostProcessor{
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Crud) {
			System.out.println("CRUD bean instantiation Successfully");
		}else if(bean instanceof MyService) {
			System.out.println("MyService bean instantiation Successfully");
		}else if(bean instanceof MyController){
			System.out.println("MyController bean instantiation Successfully");
		}
		
		return bean;
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Crud) {
			Crud crud=(Crud) bean;
			if(crud.getList() != null) {
				System.out.println("CRUD bean initialized Successfully");
			}else {
				System.out.println("CRUD bean failed to initialized");
			}
			
			
		}else if(bean instanceof MyService) {
			System.out.println("MyService bean initialized Successfully");
		}else if(bean instanceof MyController){
			System.out.println("MyController bean initialized Successfully");
		}
		
		return bean;
	}

	
	
}
