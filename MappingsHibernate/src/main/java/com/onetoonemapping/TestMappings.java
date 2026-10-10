package com.onetoonemapping;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestMappings {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		openSession.beginTransaction();
		
		Aadhar aadhar = new Aadhar(12256,LocalDate.now());
		
		Citizen citizen = new Citizen("fayaz",18,aadhar);
//		
//		openSession.persist(aadhar);
		
		
//		openSession.persist(citizen);
		
		Citizen find = openSession.find(Citizen.class, 2);
		System.out.println(find);
		
		
		openSession.getTransaction().commit();
		
		
		
		
	
	}

}
