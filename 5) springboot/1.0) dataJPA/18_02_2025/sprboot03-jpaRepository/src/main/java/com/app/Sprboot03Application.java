package com.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.app.entity.Employee;
import com.app.repository.MyJpaRepository;

@SpringBootApplication
public class Sprboot03Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Sprboot03Application.class, args);
		
		MyJpaRepository bean = cac.getBean(MyJpaRepository.class);
		
//		List<Employee> all = bean.findAll(Sort.by("name").descending());
//		all.forEach(n->System.out.println(n));
		
//		Page<Employee> page = bean.findAll(PageRequest.of(0, 2));
//		System.out.println(page.getTotalElements());
//		System.out.println(page.getTotalPages());
		
//		Page<Employee> page = bean.findAll(PageRequest.of(0, 2));
//		List<Employee> content=page.getContent();
//		System.out.println(content);
		
		//custom method
//		int insert = bean.insert(80, "pratik");
//		System.out.println(insert);
		
//		int deletedRows = bean.delete(10);
//        System.out.println("Number of rows deleted: " + deletedRows);
		
        int updatedRows = bean.update(12, "rahul");
        System.out.println("Number of rows updated: " + updatedRows);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
