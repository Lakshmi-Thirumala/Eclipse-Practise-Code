package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate {
	
	public static void main(String[] args) {
		
		
		//configuration
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Students.class);
		//session factory
		
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		//session
		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Students std1 = new Students(2,"Gopi",95);
		
		session.persist(std1);
		
		session.getTransaction().commit();
		
		
		
		
	}
	

}
