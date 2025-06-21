package com.app;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;

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
//		update(session);
		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String sql="delete from yemployee where id=:id";
		NativeQuery nativeQuery = session.createNativeQuery(sql);
		nativeQuery.setParameter("id", 1991);
		
		nativeQuery.executeUpdate();
		System.out.println("Data Deleted");
		
		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String sql="update yemployee set salary=:salary where id=:id";
		NativeQuery nativeQuery = session.createNativeQuery(sql);
		nativeQuery.setParameter("salary", 987987);
		nativeQuery.setParameter("id", 1991);
		
		nativeQuery.executeUpdate();
		System.out.println("Data Updated");
		
		transaction.commit();
	}

	private static void read(Session session) {
//		String sql="select * from yemployee";
//		NativeQuery nativeQuery = session.createNativeQuery(sql);
		NativeQuery nativeQuery=session.getNamedNativeQuery("readAll");		//by named native query
		nativeQuery.addEntity(Employee.class);
		List<Employee> list=nativeQuery.getResultList();
		for(Employee emp:list) {
			System.out.println(emp);
		}
	}

	private static void insert(Session session) {
		Transaction transaction=session.getTransaction();
		transaction.begin();
		
		String sql="insert into yemployee(id,name,address,salary) values(:id,:name,:address,:salary)";
		NativeQuery nativeQuery = session.createNativeQuery(sql);
		nativeQuery.setParameter("id", 1991);
		nativeQuery.setParameter("name", "rakesh");
		nativeQuery.setParameter("address", "delhi");
		nativeQuery.setParameter("salary", 15000);
		
		nativeQuery.executeUpdate();
		System.out.println("Data Inserted");
		
		transaction.commit();
		
	}
	
	
	
}
