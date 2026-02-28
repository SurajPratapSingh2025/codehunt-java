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
	public int setId() {
		int id=10;
		return id;
	}
	@Bean
	public Car setCar() {
		return new Car();
	}
	@Bean
	public Map<String,String> setBooks(){
		Map<String,String> books=new HashMap<>();
		books.put("book1", "fund. of it");
		books.put("book2", "Operating System");
		return books;
	}

}
