package com.platzi.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.platzi.Hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		SessionFactory sessionFactory;
		Configuration configuration = new Configuration();
		configuration.configure();
		sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		Teacher teacher = new Teacher();
		teacher.setAvatar("Prueba");
		teacher.setName("prueba");
		
		session.beginTransaction();
		session.save(teacher);
		session.getTransaction().commit();
		
	}
}
