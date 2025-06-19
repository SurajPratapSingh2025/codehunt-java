package com.app;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.app.entity.Employee;

public class Launch {
	
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberimpl");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "rootsystem");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);
		
		//Load configuration from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Employee.class); //mapping details
		
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		insert(session);
//		read(session);
//		update(session);
//		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction=session.getTransaction();
		Employee employee=new Employee(10,"rahul","patna",2000);
		if(employee != null) {
			transaction.begin();
			session.delete(employee);
			System.out.println("Data Deleted");
			transaction.commit();
		}
	}

	private static void update(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		Employee employee=new Employee(10,"rahul","patna",2000);
		if(employee != null) {
			employee.setEsalary(5555);
			session.update(employee);
			System.out.println("Data Updated");
		}
		transaction.commit();
	}

	private static void read(Session session) {
		Employee employee=new Employee(10,"rahul","patna",2000);
		System.out.println(employee);
	}

	private static void insert(Session session) {
		Employee employee=new Employee(152,"sura","pata",300);
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		session.save(employee);
		System.out.println("Data Inserted");
		
		transaction.commit();
		
	}
	
	
	
}

