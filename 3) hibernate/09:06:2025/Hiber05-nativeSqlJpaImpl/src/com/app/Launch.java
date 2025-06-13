package com.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.app.entity.Employee;



public class Launch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("config");
		EntityManager em=ef.createEntityManager();
		
//		insert(em);
//		read(em);
//		update(em);
		delete(em);
		
		em.close();
		ef.close();
	}

	private static void delete(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
//		String sql="delete from xemployee where id>=?";
//		Query query=em.createNativeQuery(sql);
//		query.setParameter(1, 10);
		
		Query query=em.createNamedQuery("deleteSQL");			//from named native query annotation
		query.setParameter("id", 10);
		
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Deletion");
		em.close();
	}
	
	private static void update(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		String sql="update xemployee set salary=? where id>=?";
		Query query=em.createNativeQuery(sql);
		query.setParameter(1, 13000);
		query.setParameter(2, 1509);
		
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Updation");
		em.close();
	}
	
	private static void read(EntityManager em) {
		String sql="select * from xemployee";
		Query query = em.createNativeQuery(sql,Employee.class);
		List<Employee> list=query.getResultList();
		
		for(Employee e:list) {
			System.out.println(e);
		}
		em.close();
	}

	private static void insert(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		String sql="insert into xemployee(id,name,address,salary) values(?,?,?,?)";
		for(int i=1; i<10; i++) {
			Query nativeQuery=em.createNativeQuery(sql);
			nativeQuery.setParameter(1, 2345+i);
			nativeQuery.setParameter(2, "rajhna"+i);
			nativeQuery.setParameter(3, "pk"+i);
			nativeQuery.setParameter(4, 1500+i);
			
			nativeQuery.executeUpdate();
		}
		transaction.commit();
		em.close();
		System.out.println("Bulk Data Insertion");
	}

}
