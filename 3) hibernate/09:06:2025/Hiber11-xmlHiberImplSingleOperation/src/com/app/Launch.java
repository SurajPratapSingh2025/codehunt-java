package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class Launch {
	
	public static void main(String[] args) {
		//Load configuration from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.configure();
		//sessionFactory: setup ready (heavy weight object(pool,mapping,session))
		SessionFactory sf=configuration.buildSessionFactory();
		//to interact with DB we use session
		Session session=sf.openSession();
		
//		insert(session);
//		read(session);
		update(session);
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
		Employee employee=new Employee(10,"rahul","patna",2000);
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		session.save(employee);
		System.out.println("Data Inserted");
		
		transaction.commit();
		
	}
	
	
	
}

