package com.app;

import java.util.Arrays;
import java.util.List;
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
//		readFromEmployee(session);
		readFromAccount(session);
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
		
		System.out.println(account);	//account details print from toString
		
		/*
		Since in both read operation we use toString so it generate "Stack Over Flow" error because it's  forms a loop
		So avoid above error we use a trick i.e. in one entity will be remove from other entity in toString
		*/
		
		//employee details print from getter
		System.out.println(account.getEmployee().getEmployeeId());
		System.out.println(account.getEmployee().getEmployeeName());
		
	}

	private static void readFromEmployee(Session session) {
		Employee employee = session.get(Employee.class, "e28");
		
		List<Account> list=employee.getAccount();
		for(Account acc:list) {
			System.out.println(employee);
		}
		
	}
	
	private static void insert(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		Account account1=new Account("850275925060","rajuAcc","patna1","sbi1","SBIN0000151");
		Account account2=new Account("850275925061","rajuAcc","patna2","sbi2","SBIN0000152");
		Account account3=new Account("850275925062","rajuAcc","patna3","sbi3","SBIN0000153");
		
		List<Account> account=Arrays.asList(account1,account2,account3);
		
		Employee employee=new Employee("e28","raju",account);
		
		account1.setEmployee(employee);
		account2.setEmployee(employee);
		account3.setEmployee(employee);
		
		session.save(employee);
		
		transaction.commit();
		
	}
	
	
	

}
