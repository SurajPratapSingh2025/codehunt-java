package com.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Spb13ServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spb13ServiceRegistryApplication.class, args);
	}

}
