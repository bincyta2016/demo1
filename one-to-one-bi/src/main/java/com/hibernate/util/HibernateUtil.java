package com.hibernate.util;

import org. hibernate. SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Customer;
import com.hibernate.entity.Policy; 

//public class HibernateUtil { 
//
//	private static SessionFactory sessionFactory;
//	private static StandardServiceRegistry registry;
//// get session factory 
//	
//	public static SessionFactory getSessionFactory() {
//
//		// TODO Auto-generated method stub
//		if (sessionFactory == null) 
//		{
//			try {
//				
//			registry= new StandardServiceRegistryBuilder().configure().build();
//			
//			MetadataSources sources= new MetadataSources(registry);
//			
//			Metadata metadata= sources.getMetadataBuilder().build();
//			
//			sessionFactory = metadata.getSessionFactoryBuilder().build();
//			}
//			catch(Exception e)
//			{
//				e.printStackTrace();
//				if(registry!=null) {
//					StandardServiceRegistryBuilder.destroy(registry);
//				}
//					
//			}
//		}
//			
//		return sessionFactory;
//		
//	} 
//	public static void shutdown() {
//		if(registry!=null) {
//			StandardServiceRegistryBuilder.destroy(registry);
//		}
//	}
//	
//	 
//} 




public class HibernateUtil { 

	static SessionFactory sessionFactory = null; 
// get session factory 
	
	public static SessionFactory getSessionFactory() {
		// TODO Auto-generated method stub
		if (sessionFactory == null) 
		{
			Configuration configuration = new Configuration().addAnnotatedClass(Policy.class).addAnnotatedClass(Customer.class).configure("hibernate/hibernate.cfg.xml"); 
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()); 
			sessionFactory = configuration.buildSessionFactory(builder.build()); 
	     }
		return sessionFactory;
		
	} 
	
	 
} 
