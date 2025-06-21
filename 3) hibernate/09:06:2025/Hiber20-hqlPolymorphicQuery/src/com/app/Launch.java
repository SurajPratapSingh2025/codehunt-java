package com.app;

import java.util.List;
import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.app.entity.Cricketer;
import com.app.entity.Footballer;
import com.app.entity.Player;

public class Launch {

	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put(Environment.URL, "jdbc:mysql://localhost:3306/hiberimpl");
		properties.put(Environment.USER, "root");
		properties.put(Environment.PASS, "rootsystem");
		properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
		properties.put(Environment.HBM2DDL_AUTO, "update");
		properties.put(Environment.SHOW_SQL, true);

		// Load configuration from hibernate.cfg.xml
		Configuration configuration = new Configuration();
		configuration.setProperties(properties);
		configuration.addAnnotatedClass(Player.class); // mapping details
		configuration.addAnnotatedClass(Footballer.class); // mapping details
		configuration.addAnnotatedClass(Cricketer.class); // mapping details

		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();

//		insert(session);
//		readSQL(session);
		readHQL(session);
//		update(session);
//		delete(session);
	}

	private static void delete(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		transaction.commit();
	}

	private static void update(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		transaction.commit();
	}

	private static void readSQL(Session session) {
		String sql="select * from cricketer UNION ALL select * from footballer";
		NativeQuery nativeQuery = session.createNativeQuery(sql);
		List<Object[]> list=nativeQuery.getResultList();
		for(Object[] arr:list) {
			for(Object o:arr) {
				System.out.println(o+" ");
			}
			System.out.println();
		}
	}
	//polymorphic query
	private static void readHQL(Session session) {
		String hql="from Player";
		Query query = session.createQuery(hql);
		List<Player> list=query.list();
		for(Player p:list) {
			if(p instanceof Cricketer) {
				System.out.println(p);
			}else {
				System.out.println(p);
			}
		}
//		System.out.println(list);
	}

	private static void insert(Session session) {
		Transaction transaction = session.getTransaction();
		transaction.begin();

		Cricketer cricketer = new Cricketer(123, "raju", 1000, "wk");
		Footballer footballer = new Footballer(125, "kaju", 70, "gk");

		session.save(footballer);
		session.save(cricketer);

		transaction.commit();

	}

}
