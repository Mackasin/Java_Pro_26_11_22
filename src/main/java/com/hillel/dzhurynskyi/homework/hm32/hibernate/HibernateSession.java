package com.hillel.dzhurynskyi.homework.hm32.hibernate;

import com.hillel.dzhurynskyi.homework.hm32.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.io.File;


public class HibernateSession {
    protected static SessionFactory sessionFactory=buildSessionFactory();
    protected Session sessionObj;
    protected static SessionFactory buildSessionFactory(){
        Configuration configObj = new Configuration();
        configObj.addAnnotatedClass(Student.class);
        configObj.configure(new File("src/main/resources/hibernate/hibernate.cfg.xml"));
        ServiceRegistry serviceRegistryObj= new StandardServiceRegistryBuilder()
                .applySettings(configObj.getProperties())
                .build();
        return configObj.buildSessionFactory(serviceRegistryObj);
    }
}
