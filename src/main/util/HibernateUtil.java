package main.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 * Created by mikaelnaas on 15/11/16.
 */
public class HibernateUtil {

    private static final SessionFactory sessionFactory;

    static {
        try {

            sessionFactory = new Configuration().configure("/main/resources/hibernate.cfg.xml").
                    buildSessionFactory();

        } catch (Throwable ex) {
            // Log the exception.
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
