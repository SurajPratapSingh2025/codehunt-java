package com.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mainapp.repository.StudentCrud;

@SpringBootApplication
public class Spr01DataJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Spr01DataJpaApplication.class, args);
		StudentCrud bean = cac.getBean(StudentCrud.class);
//		System.out.println(bean);
		
//		bean.save(new StudentEntity(29,"mayank","mca",19723.23f,"psc","munna chak"));
//		System.out.println("Data Inserted");
		
//		List<StudentEntity> list = bean.findAll();
//		for(StudentEntity e:list) {
//			System.out.println(e);
//		}
//		System.out.println("Read All Data");
//		
//		//*************read all data with sorting**************
//		System.out.println("*************read all data with sorting**************");
//		List<StudentEntity> list1 = bean.findAll(Sort.by("fee"));
//		for(StudentEntity e:list1) {
//			System.out.println(e);
//		}
//		System.out.println("Read All Data");
		
		
//		System.out.println("Data ReadById: "+bean.findById(29));
		
//		bean.deleteAll();
//		bean.deleteById(11);
//		System.out.println("Data Deleted");
		
//		StudentEntity studentEntity1 = new StudentEntity(30,"mayank2","mca2",19722.23f,"psc2","patna2");
//		StudentEntity studentEntity2 = new StudentEntity(31,"mayank3","mca3",19723.23f,"psc3","patna3");
//		StudentEntity studentEntity3 = new StudentEntity(32,"mayank4","mca4",19724.23f,"psc4","patna4");
//		bean.saveAll(Arrays.asList(studentEntity1,studentEntity2,studentEntity3));
//		System.out.println("Bulk Data Updated");
		
		//************************Customize Query*********************************
//		System.out.println("Custom Data Insert: "+bean.saveMyData(54, "pratap", "master", 15000.27f, "cocas", "rajendra"));
//		System.out.println("Custom Data Read: "+bean.readMyData());
//		System.out.println("Custom All Data Read: "+bean.readMyAllData());
		
		
		//***********************Custom Conventionally method***********************
//		System.out.println(bean.findByFee(18000.00f));
		System.out.println(bean.findByFeeLessThan(20000.00f));
		
		
		
		
		
		
		
		
		
	}

}
