package com.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.app.entity.Employee;

public class Launch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("config");
		EntityManager em=ef.createEntityManager();
		
//		insert(em);
//		read(em);
//		update(em);
		delete(em);
		
		em.close();
		ef.close();
	}

	private static void delete(EntityManager em) {
		Employee employee=em.find(Employee.class,11);
		if(employee != null) {
			EntityTransaction transaction=em.getTransaction();
			transaction.begin();
			
			em.remove(employee);
			
			transaction.commit();
			System.out.println("Data Delete Successfully");
		}else {
			System.out.println("Data Not Found");
		}
	}
	
	private static void update(EntityManager em) {
		Employee employee=em.find(Employee.class,11);
		if(employee != null) {
			EntityTransaction transaction=em.getTransaction();
			transaction.begin();
			
			employee.setEsalary(5000);
			em.merge(employee);
			
			transaction.commit();
			System.out.println("Data Update Successfully");
		}else {
			System.out.println("Data Not Found");
		}
	}
	
	private static void read(EntityManager em) {
		Employee employee=em.find(Employee.class,11);
		System.out.println(employee);
	}

	private static void insert(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		Employee employee=new Employee(1,"aaju","kek",100);
		em.persist(employee);
		
		transaction.commit();
		System.out.println("Data Inserted SUCCESSFULLY");
	}

}
