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
		
//		String jpql="delete from Employee where eid>=:eid";
//		Query query=em.createQuery(jpql);
		
		Query query=em.createNamedQuery("deleteJPQL");	//from named query annotation
		
		query.setParameter("eid", 30);
		
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Deletion");
		em.close();
	}
	
	private static void update(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		String sql="update Employee set esalary=:esalary where eid>=:eid";
		Query query=em.createQuery(sql);
		query.setParameter("esalary", 13000);
		query.setParameter("eid", 30);
		
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Updation");
		em.close();
	}
	
	private static void read(EntityManager em) {
		String jpql="select e from Employee e";				//cupulsory aliasing
		Query query = em.createQuery(jpql,Employee.class);
		List<Employee> list=query.getResultList();
		
		for(Employee e:list) {
			System.out.println(e);
		}
		em.close();
	}

	private static void insert(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		//in jpql, there is no any insert method
		//Native SQL method
//		String sql="insert into xemployee(id,name,address,salary) values(?,?,?,?)";
//		for(int i=1; i<10; i++) {
//			Query nativeQuery=em.createNativeQuery(sql);
//			nativeQuery.setParameter(1, 2345+i);
//			nativeQuery.setParameter(2, "rajhna"+i);
//			nativeQuery.setParameter(3, "pk"+i);
//			nativeQuery.setParameter(4, 1500+i);
//			nativeQuery.executeUpdate();
//		}
		//Persist method
		for(int i=1;i<10;i++) {
			Employee employee=new Employee(33+i,"raj"+i,"patna"+i,7000+i);
			em.persist(employee);
			if(i%5==0)
				em.flush();				//clear cache memory
		}
		transaction.commit();
		em.close();
		System.out.println("Bulk Data Insertion");
	}

}
