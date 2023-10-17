package org.example.utils;

import org.example.dao.SupplierEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateUtil {
    private static SessionFactory sessionFactory;

    private HibernateUtil() {
    }

    private static synchronized void initializeSessionFactory() {
        if (sessionFactory == null) {
            try {
                StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                        .configure("hibernate.cfg.xml")
                        .build();

                Metadata metadata = new MetadataSources(standardRegistry)
                        .addAnnotatedClass(SupplierEntity.class)
                        .getMetadataBuilder()
                        .applyImplicitNamingStrategy(ImplicitNamingStrategyJpaCompliantImpl.INSTANCE)
                        .build();

                sessionFactory = metadata.getSessionFactoryBuilder()
                        .build();
            } catch (Exception e) {
                // Handle the exception (log it, throw a custom exception, etc.)
                e.printStackTrace();
            }
        }
    }

    public static Session getSession() {
        if (sessionFactory == null) {
            initializeSessionFactory();
        }
        return sessionFactory.openSession();
    }
}
