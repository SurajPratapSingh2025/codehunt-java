package com.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Launch {
	
	public static void main(String[] args) {
		
		EntityManagerFactory ef=Persistence.createEntityManagerFactory("config");
		EntityManager em = ef.createEntityManager();
		System.out.println(em);
	}

}
