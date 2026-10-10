package com.hibdaythree;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class CompositeKeys {

          public static void main(String... args) {
        	  
        	  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
        	  Session openSession = sessionFactory.openSession();
        	  
        	  openSession.beginTransaction();
        	  
        	  CarId carId = new CarId(1256,123);
        	  Car car =  new Car(carId,"Altroz","Tata",9000000);
        	  
        	  openSession.persist(car);
        	  openSession.getTransaction().commit();
        	  
        	  
             }

}
