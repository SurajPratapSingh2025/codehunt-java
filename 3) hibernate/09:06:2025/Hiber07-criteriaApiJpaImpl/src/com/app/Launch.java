package com.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.CriteriaUpdate;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

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
		
		CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
		CriteriaDelete<Employee> cd = criteriaBuilder.createCriteriaDelete(Employee.class);
		Root<Employee> root = cd.from(Employee.class);
		
		cd.where(criteriaBuilder.lessThan(root.get("eid"), 40));
		
		Query query=em.createQuery(cd);
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Deletion");
		em.close();
	}
	
	private static void update(EntityManager em) {
		EntityTransaction transaction=em.getTransaction();
		transaction.begin();
		
		CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
		CriteriaUpdate<Employee> cu = criteriaBuilder.createCriteriaUpdate(Employee.class);
		Root<Employee> root = cu.from(Employee.class);
		
		cu.set("esalary",6000);
		cu.where(criteriaBuilder.lessThan(root.get("eid"), 40));
		
		Query query=em.createQuery(cu);
		query.executeUpdate();
		
		transaction.commit();
		System.out.println("Bulk Data Updation");
		em.close();
	}
	
	private static void read(EntityManager em) {
		CriteriaBuilder criteriaBuilder=em.getCriteriaBuilder();
		CriteriaQuery<Employee> cq = criteriaBuilder.createQuery(Employee.class);
		Root<Employee> root = cq.from(Employee.class);
		
//		cq.select(root);
//		TypedQuery<Employee> query = em.createQuery(cq);
//		List<Employee> list = query.getResultList();
//		System.out.println(list);
		
		//specific case:: select id name where name like 'r%' and id>40
		Predicate p1=criteriaBuilder.like(root.get("ename"), "r%");
		Predicate p2=criteriaBuilder.greaterThan(root.get("eid"), 40);
		cq.multiselect(root.get("eid"),root.get("ename")).where(criteriaBuilder.and(p1,p2));
		List<Employee> list=em.createQuery(cq).getResultList();
		System.out.println(list);
		
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
