package com.mainapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPostProcessorImpl implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Employee) {
			System.out.println("employee encryption "+beanName);
		}else if(bean instanceof Student){
			System.out.println("student encryption "+beanName);
		}
		return bean;
	}

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if(bean instanceof Employee) {
			System.out.println("employee decryption "+beanName);
		}else if(bean instanceof Student){
			System.out.println("student decryption "+beanName);
		}
		return bean;
	}
	
}
