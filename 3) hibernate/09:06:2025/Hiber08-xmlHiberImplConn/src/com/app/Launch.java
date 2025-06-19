package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Launch {
	
	public static void main(String[] args) {
		//Load configuration from hibernate.cfg.xml
		Configuration configuration=new Configuration();
		configuration.configure();
		//sessionFactory: setup ready (heavy weight object(pool,mapping,session))
		SessionFactory sf=configuration.buildSessionFactory();
		//to interact with DB we use session
		Session session=sf.openSession();
		
		System.out.println(session);
	}
}