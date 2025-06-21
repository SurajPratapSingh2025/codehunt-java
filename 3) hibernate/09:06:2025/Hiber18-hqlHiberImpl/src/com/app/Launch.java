package com.app;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.Query;

import com.app.entity.Employee;
import com.app.entity.EmployeeTest;

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
		configuration.addAnnotatedClass(EmployeeTest.class);
		
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		
		
//		copy(session);
		read(session);
//		update(session);
//		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String hql="delete from Employee where eid=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("eid", 1991);
		
		query.executeUpdate();
		System.out.println("Data Deleted");
		
		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String hql="update Employee set esalary=:esalary where eid=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("esalary", 8080);
		query.setParameter("eid", 1991);
		
		query.executeUpdate();
		System.out.println("Data Updated");
		
		transaction.commit();
	}

	private static void read(Session session) {
//		String hql="from Employee";
//		Query query = session.createQuery(hql);
		Query query = session.getNamedQuery("readAll");		// from named query anotation
		List<Employee> list=query.list();
		for(Employee e:list) {
			System.out.println(e);
		}
	}
	
	// here only data copy, Don't insert, insert happen through either nativeSQL or normal method in hiber impl
	private static void copy(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String hql="insert into Employee(eid,ename,eaddress,esalary) select eid,ename,eaddress,esalary from EmployeeTest";
		Query query = session.createQuery(hql);
		
		query.executeUpdate();
		System.out.println("Data Copied");
		
		transaction.commit();
		
	}
	
	
	
}
