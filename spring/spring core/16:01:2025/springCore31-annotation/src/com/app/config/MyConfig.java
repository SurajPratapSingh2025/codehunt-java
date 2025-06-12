package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.app.Employee;

@Configuration
@ComponentScan(basePackages= {"com.app","com.postprocessor"})
public class MyConfig {
	
	@Bean
	public Employee employeeBean() {
		System.out.println("Custom Logic");
		return new Employee();
	}
	
	
	
}
