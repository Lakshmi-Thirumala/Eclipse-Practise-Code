package hibernatetwo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDayTwo {
	  
	public static void main(String... args) {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
    SessionFactory sessionFactory2 = HibernateUtil.getSessionFactory();
	System.out.println(sessionFactory);
	System.out.println(sessionFactory2);
	
    Session session = sessionFactory.openSession();
    
//   Student std1 =  session.find(Student.class,2);
//   
////   Student std1 = new Student();
//   
//  
//   std1.setName("Lakshmi");
//   
    
    Employee emp1 = new Employee("Lakshmi",50000);
   session.beginTransaction();
//     session.merge(std1);
//   
//   System.out.println(std1);
   
   session.persist(emp1);
  
   session.getTransaction().commit();
	
	
	
}
}