package com.mainapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.mainapp" })
public class MyConfiguration {

	@Bean(initMethod="annoInit",destroyMethod="annoDestroy")
	public Employee getEmployee() {
		System.out.println("Employee bean mapping");
		return new Employee();
	}

//	@Bean
//	 public BeanPostProcessorImpl getBeanPostProcessorImpl() {
//	 System.out.println("BeanPostProcessorImpl bean mapping"); 
//	 return new BeanPostProcessorImpl(); }
//	 

}
