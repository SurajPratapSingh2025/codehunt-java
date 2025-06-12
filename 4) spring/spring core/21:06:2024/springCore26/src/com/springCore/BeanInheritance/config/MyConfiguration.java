package com.springCore.BeanInheritance.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springCore.BeanInheritance.Google;
import com.springCore.test.Meta;

@Configuration
@ComponentScan(basePackages= {"com.springCore.BeanInheritance","com.springCore.test","com.springCore.beanProcessor"})
public class MyConfiguration {
	
	@Bean(name="google")
	public Google getGoogleObject() {
		System.out.println("custom logic for Google");
		return new Google();
	}
	
	@Bean(name="meta")
	public Meta getMetaObject() {
		System.out.println("custom logic for Meta");
		return new Meta();
	}
}
