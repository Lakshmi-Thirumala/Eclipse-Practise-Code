package com.hibdaythree;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class NamedQueryOperations {
	
	public static  void main(String args[]) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		openSession.beginTransaction();
//		Query<Employee> createNamedQuery = openSession.createNamedQuery("allemployees",Employee.class);
//		List<Employee> li = createNamedQuery.list();
		
		Query<Employee> createNamedQuery = openSession.createNamedQuery("singleemployee",Employee.class);
		createNamedQuery.setParameter(1,2);
		List<Employee> list = createNamedQuery.list();
		System.out.println(list);
		openSession.getTransaction().commit();
	
	}

}
