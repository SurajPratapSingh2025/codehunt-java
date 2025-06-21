package com.app;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.app.entity.Cricketer;
import com.app.entity.Footballer;
import com.app.entity.Player;

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
		configuration.addAnnotatedClass(Player.class); 		//mapping details
		configuration.addAnnotatedClass(Footballer.class); 	//mapping details
		configuration.addAnnotatedClass(Cricketer.class); 	//mapping details
		
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
		
		Cricketer cricketer=new Cricketer(123,"raju",1000,"wk");
		Footballer footballer=new Footballer(125,"kaju",70,"gk");
		
		session.save(footballer);
		session.save(cricketer);
		
		transaction.commit();
		
	}
	
	
	
}
