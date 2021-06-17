package com.hibernate.app;
import com.hibernate.entity.Customer;

import com.hibernate.entity.Policy;

import com.hibernate.dao.CustomerDao;


import com.hibernate.entity.Customer;
import com.hibernate.entity.Policy;
import com.hibernate.dao.PolicyDao;

import antlr.collections.List;

import com.hibernate.dao.CustomerDao;
import com.hibernate.dao.PolicyDao;
public class App {

	public static void main(String[] args) {

		createCustomer();
		
		displayPolicy(1);
		displayCustomer(1);
		

	}
	

	public static void createCustomer()
	{
		
		System.out.println("====create customer====");
		CustomerDao dao=new CustomerDao();
		Policy p=new Policy("abb","vehicle",45,44,5);
		Customer c=new Customer();
		c.setName("bincy");
		c.setAge(22);
		c.setEmail("bincy@gmail.com");
		c.setNumber(444);
		
		c.addPolicy(p);
		
	    dao.saveCustomer(c);
	}
	
	public static void displayCustomer(int id) {
		
		System.out.println("===display customer===");
		CustomerDao dao=new CustomerDao();
		Customer c=dao.getCustomer(id);
		//System.out.println(c.toString());
		System.out.println(c.getP_details().toString());
		
		
	}
	
	public static void displayPolicy(int id) {
		System.out.println("===Display policy===");
		PolicyDao dao=new PolicyDao();
		Policy p=dao.getPolicy(id);
		//System.out.println(p.toString());
		System.out.println("===customer retrived from policy===");
		Customer c=p.getCustomer();
		System.out.println(c.toString());
		//System.out.println(p.toString());
		
		System.out.println("===policy retrived from customer===");
		System.out.println(c.getP_details().toString());
	}
}

