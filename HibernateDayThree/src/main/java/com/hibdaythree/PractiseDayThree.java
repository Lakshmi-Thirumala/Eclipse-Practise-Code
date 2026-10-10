package com.hibdaythree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class PractiseDayThree {
	
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		Employee employee = openSession.find(Employee.class,1);
		
		
		//Transient state
		Employee emp1 = new Employee("Sri",350000);
		
		openSession.beginTransaction();
		employee.setEmployeeSalary(27000);
//		openSession.merge(employee);
		
		//persistenat state 
//		openSession.persist(emp1);
		
		emp1.setEmployeeSalary(80000);
//		openSession.merge(emp1);
		
		openSession.getTransaction().commit();
		
		System.out.println("Updated Employee");
		
		openSession.close();
		
		employee.setEmployeeSalary(100000);
		emp1.setEmployeeName("Nikki");
		
		
		}

}
