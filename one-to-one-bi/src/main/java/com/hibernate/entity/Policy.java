package com.hibernate.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="policy")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int id;
	@Column(name="Name")
	private String name;
	@Column(name="Category")
	private String category;
	@Column(name="Sum_assured")
	private int sum_assured;
	@Column(name="Premium")
	private int premium;
	@Column(name="Tenure")
	private int tenure;
	@OneToOne(mappedBy="p_details",cascade=CascadeType.ALL,orphanRemoval=true,fetch=FetchType.LAZY)
	private Customer customer;
	
	
	
	
	public Policy( String name, String category, int sum_assured, int premium, int tenure) {
		super();
		
		this.name = name;
		this.category=category;
		this.sum_assured = sum_assured;
		this.premium = premium;
		this.tenure = tenure;
	}

	public Policy()
	{
		
	}

	public Customer getCustomer() {
		return customer;
	}



	public void setCustomer(Customer customer) {
		this.customer = customer;
	}



	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCategory() {
		return category;
	}


	


	public int getSum_assured() {
		return sum_assured;
	}


	public void setSum_assured(int sum_assured) {
		this.sum_assured = sum_assured;
	}


	public int getPremium() {
		return premium;
	}


	public void setPremium(int premium) {
		this.premium = premium;
	}


	public int getTenure() {
		return tenure;
	}


	public void setTenure(int tenure) {
		this.tenure = tenure;
	}


	@Override
	public String toString() {
		return "Policy [id=" + id + ", name=" + name + ", Catgory=" + category + ", sum_assured=" + sum_assured
				+ ", premium=" + premium + ", tenure=" + tenure  +"]";
	}




	public void setCategory(String category) {
		// TODO Auto-generated method stub
		this.category=category;
	}


	
}
