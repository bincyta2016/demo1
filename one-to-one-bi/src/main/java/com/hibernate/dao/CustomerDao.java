package com.hibernate.dao;

import java.util.List;

import javax.transaction.Transaction;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.hibernate.entity.Customer;
import com.hibernate.entity.Policy;
import com.hibernate.util.HibernateUtil;


public class CustomerDao {
	
	
	static SessionFactory sessionFactory = null; 
	//Transaction t=null;
	// fetch and display all 
	public void saveCustomer(Customer c)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		session.save(c.getP_details());
		session.save(c);
		session.getTransaction().commit();
		System.out.println("inserted Successfully \n" + c.toString());
		session.close();
	}
	public Customer getCustomer(int id) {
		
		Customer c;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		c=session.get(Customer.class, id);
		System.out.println(c.toString());
		session.close();
		return c;
	}
	
	public void update(Customer c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session. beginTransaction();
		session.update(c);
		session.close();
	}
	public void delete(int id) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session. beginTransaction();
		Customer c = getCustomer(id);
		//Customer c = session.getCustomer(Customer.class,id);
		session.delete(c);
		
		System.out.println("Deleted"+id);
		session.close();
	}
	
	public Policy getPolicy(int id) {
		
		Policy p;
		Session session = HibernateUtil.getSessionFactory().openSession();
		session. beginTransaction();
		p=session.get(Policy.class, id);
		session.close();
		return p;
	}




}
