package com.app;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.app.entity.Account;
import com.app.entity.Employee;

public class Launch {
	
	public static void main(String[] args) {
		Properties properties=new Properties();
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberimpl");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "rootsystem");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.HBM2DDL_AUTO, "update");	//Note: only use here create for insert
		properties.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
		properties.put(Environment.SHOW_SQL, true);
		
		//Load configuration from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Employee.class); 		//mapping details
		configuration.addAnnotatedClass(Account.class); 		//mapping details
		
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		
//		insert(session);
		readFromEmployee(session);
//		readFromAccount(session);
//		update(session);
//		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		Employee employee = session.get(Employee.class, "e28");
		session.delete(employee);
		
		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		Employee employee = session.get(Employee.class, "e28");
		employee.setEmployeeName("kaju");
		session.update(employee);
		
		transaction.commit();
	}
	
	private static void readFromAccount(Session session) {
		Account account = session.get(Account.class, "850275925060");
		System.out.println(account);
		
		/*
		Since in both read operation we use toString so it generate "Stack Over Flow" error because it's  forms a loop
		So avoid above error we use a trick i.e. in one entity will be remove from other entity in toString
		*/
		
	}

	private static void readFromEmployee(Session session) {
		Employee employee = session.get(Employee.class, "e28");
		System.out.println(employee);
		
	}
	
	private static void insert(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		Account account=new Account("850275925060","rajuAcc","patna","sbi","SBIN0000152");
		Employee employee=new Employee("e28","raju",account);
		
		account.setEmployee(employee);
		session.save(employee);
		
		transaction.commit();
		
	}
	
	
	

}
