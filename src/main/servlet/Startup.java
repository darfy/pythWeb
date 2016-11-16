package main.servlet;

import main.util.HibernateUtil;
import main.util.Populator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * This is called when the servlet is started due to it being a listener (declared in web.xml)
 * It will populate the database using main/util/Populator
 *
 * Created by mikaelnaas on 15/11/16.
 */
public class Startup implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {initialize();
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    private void initialize(){
        Populator populator = new Populator();
        populator.populate(HibernateUtil.getSessionFactory());
        System.out.println("initialization complete");


    }
}
