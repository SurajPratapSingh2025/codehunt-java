package com.app;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.app.entity.Employee;
import com.app.repository.MyCrudRepository;

@SpringBootApplication
public class Sprboot02Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Sprboot02Application.class, args);
		
		MyCrudRepository bean = cac.getBean(MyCrudRepository.class);
		
//		Iterable<Employee> all = bean.findAll();
//		all.forEach(n->System.out.println(n));
		
//		bean.findAll().forEach(n->System.out.println());
		
//		Iterable<Employee> all = bean.findAll();
//		for(Employee e:all) {
//			System.out.println(e);
//		}
		
//		bean.readMyData().forEach(n->System.out.println());
		
//		bean.readMyDataHQL().forEach(n->System.out.println());
		
//		Optional<Employee> byId=bean.findById(10);
//		Employee emp = byId.get();
//		System.out.println(emp);
		
//		List<Employee> byName = bean.findByName("suraj");
//		System.out.println(byName);
		
//		List<Employee> byNameContaning = bean.findByNameContaining("suraj");
//		System.out.println(byNameContaining);
		
//		List<Employee> byName = bean.findByNameStartingWith("s");
//		System.out.println(byName);
		
//		List<Employee> byNameGreaterThan = bean.findByIdGreaterThan(10);
//		System.out.println(byNameGreaterThan);
		
//		System.out.println(bean.count());
		
		
//		Employee emp=new Employee(15,"suraj");
//		bean.save(emp);
//		System.out.println("SAVED");
		
//		Optional<Employee> byId=bean.findById(10);
//		if(byId.isPresent()) {
//			Employee emp = byById.get();
//			emp.setName("QWERTY");
//			bean.save(emp);
//			System.out.println("UPDATED");
//		}
		
		//save all
//		Employee emp1=new Employee(15,"suraj");
//		Employee emp2=new Employee(15,"suraj");
//		Employee emp3=new Employee(15,"suraj");
//		List<Employee> list=Arrays.asList(emp1,emp2,emp3);
//		bean.saveAll(list);
//		System.out.println("BULK INSERTION");
		
		
//		bean.deleteById(45);
//		System.out.println("DELETED");
		
		
		
		
		
		
	}

}
