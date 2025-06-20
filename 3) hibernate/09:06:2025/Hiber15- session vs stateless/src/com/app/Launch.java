package com.app;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StatelessSession;
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
//		Transaction transaction=session.getTransaction();
//		transaction.begin();
//		Employee employee=new Employee(10,"rahul","patna",2000);
//		if(employee != null) {
//			employee.setEsalary(5555);
//			session.update(employee);
//			System.out.println("Data Updated");
//		}
//		transaction.commit();
		
		
		//Dirty Checking
		Transaction transaction=session.getTransaction();
		transaction.begin();
		Employee employee=session.get(Employee.class, 10);
		if(employee != null) {
			employee.setEsalary(9999);						//Dirty Checking: comparision from previous object & then update
			System.out.println("Data Updated");
			transaction.commit();
		}
		
		
		
	}

	private static void read(Session session) {
//		Employee employee=new Employee(10,"rahul","patna",2000);
//		System.out.println(employee);
		
		//get() v/s load() method
//		Employee employee=session.get(Employee.class, 10);		//hit database
//		Employee employee=session.load(Employee.class, 10);		//don't hit database
//		int key=1234;
//		if(key==1111) {
//			System.out.println(employee);
//		}else {
//			System.out.println("Do Not Print");
//		}
		
		
		//session v/s stateless
		Employee e1=session.get(Employee.class, 10);
		System.out.println(e1);							//cached
		Employee e2=session.get(Employee.class, 11);
		System.out.println(e2);							//cached
		Employee e3=session.get(Employee.class, 10);
		System.out.println(e3);							// no query fired
		Employee e4=session.get(Employee.class, 11);
		System.out.println(e4);							// no query fired
		
		// when perform 1 lakh unique data operation then session is not suitable for BULK OPERATION
		// in session, manually do to flush() from prevent to cache memory fill
		// cache can manage by session.clear()
		// evict() method is used to free specific object cache
		
		
		
		
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

