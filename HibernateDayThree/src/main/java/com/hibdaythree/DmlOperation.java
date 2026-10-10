package com.hibdaythree;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.SelectionQuery;

public class DmlOperation {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session openSession = sessionFactory.openSession();
		
		
		openSession.beginTransaction();
//		Product product = new Product("Jeans",4,5000);
				
//		openSession.persist(product);
		
//		SelectionQuery<Product> createSelectionQuery = openSession.createSelectionQuery("select p from Product p",Product.class);
//		List<Product>list = createSelectionQuery.list();
//		System.out.println(list);
//		openSession.getTransaction().commit();	}
		
//		SelectionQuery<Product> createSelectionQuery = openSession.createSelectionQuery("From Product",Product.class);
//		List<Product>list = createSelectionQuery.list();
//		System.out.println(list);
//		openSession.getTransaction().commit();	}
		
//		SelectionQuery<Product> createSelectionQuery = openSession.createSelectionQuery("From Product where productId = 1",Product.class);
//		List<Product>list = createSelectionQuery.list();
//		System.out.println(list);
//		openSession.getTransaction().commit();	}
		
//		SelectionQuery<Product> createSelectionQuery = openSession.createSelectionQuery("From Product where productId = ?1",Product.class);
//		createSelectionQuery.setParameter(1,3);//(1 is question mark num 3 is id  )
//		List<Product>list = createSelectionQuery.list();
//		System.out.println(list);
//		openSession.getTransaction().commit();	}
		
//		 MutationQuery createMutationQuery = openSession.createMutationQuery("insert into Product(name,quantity,price) values(?1,?2,?3)");
//		 
//		 createMutationQuery.setParameter(1,"AC");//(1 is question mark num 3 is id  )
//		 createMutationQuery.setParameter(2,1);
//		 createMutationQuery.setParameter(3,200000);
//		 
//		createMutationQuery.executeUpdate();
//		
//		openSession.getTransaction().commit();	}
		
//	 MutationQuery createMutationQuery = openSession.createMutationQuery("update Product set quantity = ?1 where id=?2");
//		 
//		 createMutationQuery.setParameter(1,4);//(1 is question mark num 3 is id  )
//		 createMutationQuery.setParameter(2,1);
//		 
//		createMutationQuery.executeUpdate();
//		
//		openSession.getTransaction().commit();	}
		
// MutationQuery createMutationQuery = openSession.createMutationQuery("update Product set quantity = :quantity where id=:id");
//		 
//		 createMutationQuery.setParameter("quantity",5);//(1 is question mark num 3 is id  )
//		 createMutationQuery.setParameter("id",2);
//		 
//		createMutationQuery.executeUpdate();
//		
//		openSession.getTransaction().commit();	}
	
//	 MutationQuery createMutationQuery = openSession.createMutationQuery("delete from Product where id= :id");
//	 
//	 createMutationQuery.setParameter("id",2);
//	 
//	createMutationQuery.executeUpdate();
//	
//	openSession.getTransaction().commit();	}
//		
//		NativeQuery<Product> createNativeQuery = openSession.createNativeQuery("Select * from products",Product.class);
//		List<Product> list = createNativeQuery.list();
//       System.out.println(list);
		
//		NativeQuery<Product> createNativeQuery = openSession.createNativeQuery("Select * from products  where id =?1",Product.class);
//		createNativeQuery.setParameter(1,1);
//		List<Product> list = createNativeQuery.list();
//       System.out.println(list);
		

//		 MutationQuery createNativeMutationQuery = openSession.createNativeMutationQuery("insert into products(name,quantity,price) values(?1,?2,?3)");
//		 createNativeMutationQuery.setParameter(1, "Sofa");
//		 createNativeMutationQuery.setParameter(2, 2);
//		 createNativeMutationQuery.setParameter(3, 97345);
//		 createNativeMutationQuery.executeUpdate();
//		
//		 MutationQuery createNativeMutationQuery = openSession.createNativeMutationQuery("update products set quantity = ?1 where id = ?2");
//		 createNativeMutationQuery.setParameter(1, 10);
//		 createNativeMutationQuery.setParameter(2, 3);
//		 createNativeMutationQuery.executeUpdate();
		
		 MutationQuery createNativeMutationQuery = openSession.createNativeMutationQuery("delete products where id = ?2");
		 
		 createNativeMutationQuery.setParameter(2, 3);
		 createNativeMutationQuery.executeUpdate();
		
 
		 openSession.getTransaction().commit();	
      
	
	}
}
