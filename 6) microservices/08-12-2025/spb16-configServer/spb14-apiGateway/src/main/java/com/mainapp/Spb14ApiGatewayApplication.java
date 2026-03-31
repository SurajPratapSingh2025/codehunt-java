package com.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Spb14ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spb14ApiGatewayApplication.class, args);
	}

}
