package com.mainapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.mainapp" })
public class MyConfiguration {

//	@Bean
//	public Employee getEmployee() {
//		System.out.println("Employee bean mapped");
//		return new Employee();
//	}

	@Bean
	public Car getCar() {
		System.out.println("Car bean mapped");
		return new Car();
	}

}
