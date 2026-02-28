package com.mainapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.mainapp" })
public class MyConfiguration {
	@Bean
	public Map<String,String> books(){
		Map<String,String> books=new HashMap<>();
		books.put("book1", "python");
		books.put("book2", "java");
		return books;
	}
	
	@Bean
	public Car getCar() {
		return new Car();
	}
}
