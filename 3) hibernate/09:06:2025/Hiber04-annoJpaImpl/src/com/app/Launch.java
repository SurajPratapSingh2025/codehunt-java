package com.app;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.hibernate.jpa.HibernatePersistenceProvider;

import com.app.entity.Employee;
import com.app.entity.PersistenceUnitInfoImpl;

public class Launch {
	
	public static void main(String[] args) {
		
		Properties properties=new Properties();
		InputStream is=null;
		try {
			is=Launch.class.getClassLoader().getResourceAsStream("config.properties");
			if(is==null) {
				System.out.println("File Not Found");
				return;
			}
			properties.load(is);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(is!=null) {
				try {
					is.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
		
		
		
		
		
		Map<String,String> map=new HashMap<String,String>();
		for(String key: properties.stringPropertyNames()) {
			map.put(key, properties.getProperty(key));
		}
		System.out.println(map);
		
		EntityManagerFactory ef=new HibernatePersistenceProvider().createContainerEntityManagerFactory(new PersistenceUnitInfoImpl(), map);
		EntityManager em=ef.createEntityManager();
		
		insert(em);
//		read(em);
//		update(em);
//		delete(em);
		
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
		
		Employee employee=new Employee(28,"agnostic","mk",15000);
		em.persist(employee);
		
		transaction.commit();
		System.out.println("Data Inserted SUCCESSFULLY");
	}

}
