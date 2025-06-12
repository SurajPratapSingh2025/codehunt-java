package app.controller;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

//@WebListener
public class MyListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce)  { 
         
    	System.out.println("Listener START");
    }
    
    public void contextDestroyed(ServletContextEvent sce)  { 
        
    	System.out.println("Listener STOP");
   }
	
}
