package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.app.entity.Employee;

public class Launch {
    
    public static void main(String[] args) {
        // Create configuration instance
        Configuration configuration = new Configuration();
        configuration.configure();
        
        configuration.addAnnotatedClass(Employee.class); // for Employee mapping
        
        // Build session factory
        SessionFactory sf = configuration.buildSessionFactory();
        Session session = sf.openSession();
        
        System.out.println(session);
    }  
}