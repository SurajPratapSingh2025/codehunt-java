package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.entity.Employee;
import com.app.repository.Crud;
import com.app.repository.CrudDataJPA;

@SpringBootApplication
public class Sprboot01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Sprboot01Application.class, args);
		
		System.out.println("...............my app is running..............");
		
		Employee emp=new Employee(12,"rohan");
		
//		Crud bean = cac.getBean(Crud.class);
//		bean.raju(emp);
		
		CrudDataJPA bean = cac.getBean(CrudDataJPA.class);
		bean.save(emp);
		
		
		
		
		
		
		
		
		
		
		
	}

}
