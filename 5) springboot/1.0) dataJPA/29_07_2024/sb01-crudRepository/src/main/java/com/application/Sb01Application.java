package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.application.dao.Crud;

@SpringBootApplication
public class Sb01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(Sb01Application.class, args);
		Crud bean = ac.getBean(Crud.class);
		
		
//		Scanner scanner=new Scanner(System.in);
////		
//		System.out.println("Enter Id: ");
//		int id=scanner.nextInt();
//		System.out.println("Enter Name: ");
//		String name=scanner.next();
//		System.out.println("Enter Address: ");
//		String address=scanner.next();
//		System.out.println("Enter Salary: ");
//		int salary=scanner.nextInt();
		
		
//		long count = bean.count();
//		System.out.println(count);
		
		
//		Iterable<Employee> all=bean.findAll();
//		for(Employee emp:all) {
//			System.out.println(emp);
//		}
		
		
//		Optional<Employee> byId=bean.findById(28);
//		Employee employee=byId.get();
//		System.out.println(employee);
		
		
//		List<Employee> allSql=bean.readAllSql();
//		System.out.println(allSql);
		
//		List<Employee> allSql=bean.readSpecificSql();
//		System.out.println(allSql);
		
//		List<Employee> allSql=bean.readSingleSql(28);
//		System.out.println(allSql);
		
//		int updateSql = bean.updateSql(2000, 28);
//		System.out.println(updateSql);
		
//		int deleteSql = bean.deleteSql(28);
//		System.out.println(deleteSql);
		
//		bean.deleteById(27);
		
//		Employee employee = new Employee(id,name,address,salary);
//		Employee save = bean.save(employee);
//		if(save!=null) {
//			System.out.println("SAVED");
//		}
		
		//HQL Query
//		List<Employee> allHql=bean.readAllHql();
//		System.out.println(allHql);
		
		bean.updateHql(5000,28);
		bean.deleteHql(10);
		
	}

}
