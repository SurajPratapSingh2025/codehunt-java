package app.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class MyListener
 *
 */
@WebListener
public class MyListener implements ServletContextListener {

    public void contextDestroyed(ServletContextEvent sce)  { 
        System.out.println("LISTENER ON CLOSE");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("LISTENER ON STARTUP");
         ServletContext servletContext = sce.getServletContext();
         servletContext.setInitParameter("admin", "admin123");
    }
	
}
