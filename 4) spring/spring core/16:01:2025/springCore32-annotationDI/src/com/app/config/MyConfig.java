package com.app.config;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages= {"com.app.entity","com.app.controller","com.app.service","com.app.repository"})
public class MyConfig {
	
	@Bean
	public List<String> list(){
		return Arrays.asList("JAVA1","JAVA2");
	}
	
}
