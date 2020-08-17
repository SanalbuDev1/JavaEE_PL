package com.platzi.Hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionD {

	private Session session;
	
	public SessionD() {
		Session s = openSession();
	}
	
	public Session openSession() {			
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		session.beginTransaction();
		return session;
	}
	
	public Session returnSession() {
		return session;
	}
	
	public static Session openConnectionSession(Session s) {
		return s.getSessionFactory().openSession();
	}
	
	

}
