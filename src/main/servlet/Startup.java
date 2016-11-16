package main.servlet;

import main.util.HibernateUtil;
import main.util.Populator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
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
