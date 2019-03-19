package ua.bohdan;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.Properties;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            Properties properties = configuration.getProperties();
            StandardServiceRegistryBuilder serviceRegisteryBuilder = new StandardServiceRegistryBuilder();
            StandardServiceRegistry build = serviceRegisteryBuilder.applySettings(properties).build();
            sessionFactory = configuration.buildSessionFactory(build);
        } catch (Throwable e) {
            System.err.println("Initial SessionFactory creation failed. " + e);
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Session getSession() throws HibernateException {
        return sessionFactory.openSession();
    }

    public static void destroy() {
        sessionFactory.close();
    }
}