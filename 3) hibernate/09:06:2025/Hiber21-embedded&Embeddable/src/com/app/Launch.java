package com.app;

import java.time.LocalDateTime;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.app.entity.Account;
import com.app.entity.Car;
import com.app.entity.Company;
import com.app.entity.Employee;

public class Launch {
	
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberimpl");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "rootsystem");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.SHOW_SQL, true);
		
		//Load configuration from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Employee.class); 		//mapping details
		
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		
		insert(session);
//		read(session);
//		update(session);
//		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		transaction.commit();
	}

	private static void read(Session session) {
		
	}
	
	private static void insert(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		Account account=new Account("850275925060","rajuAcc","patna","sbi","SBIN0000152");
		Car car=new Car("BR01AB1234","Alto K10",LocalDateTime.now(),178000);
		Company company=new Company("reg2025","tata","policy25",account);
		Employee employee=new Employee("e28","raju",company,car);
		
		session.save(employee);
		
		transaction.commit();
		
	}
	
	
	

}
