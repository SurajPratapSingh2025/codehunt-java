package com.mainapp;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = { "com.mainapp" })
public class MyConfiguration {
	
	@Value("28")
	private int id;

//	@Bean
//	public Employee getEmployee() {
//		System.out.println("Employee bean mapped");
//		//it works after java8
////		Map<String, String> books = Map.of(
////			    "Book1", "Ramayan",
////			    "Book2", "Mahabharat"
////			);
//		
//		Map<String, String> books = new HashMap<>();
//		books.put("book1", "ramayan");
//		books.put("book2", "mahabharat");
//		
//		return new Employee(id,getCar(),books);
//	}
	
	@Bean
	public int getId() {
		return id;
	}
	
	@Bean
	public Map<String,String> getBooks(){
		Map<String,String> books=new HashMap<>();
		books.put("book1", "concept of physics");
		books.put("book2", "modern physics");
		return books;
		
	}
	
	
	
	
	
	@Bean
	public Car getCar() {
		System.out.println("Car bean mapped");
		return new Car();
	}

}
