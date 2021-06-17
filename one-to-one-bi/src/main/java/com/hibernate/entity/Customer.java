package com.hibernate.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Id")
	private int Id;
	@Column(name="Name")
	private String name;
	@OneToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="policy_id")
	private Policy p_details;
	@Column(name="Age")
	private int age;
	@Column(name="Email")
	private String email;
	@Column(name="Number")
	private int number;
	
	public Customer( String name, int age, String email, int number) {
		super();
		
		this.name = name;
		
		this.age = age;
		this.email = email;
		this.number = number;
	}
	public void addPolicy(Policy p_details)
	{
		
		p_details.setCustomer(this);
		this.p_details=p_details;
	}
	public void removePolicy()
	{
		
		p_details.setCustomer(null);
		this.p_details=null;
		
	} 

	public Policy getP_details() {
		return p_details;
	}
	public void setP_details(Policy p_details) {
		this.p_details = p_details;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Customer [Id=" + Id + ", name=" + name + ", p_details=" + p_details + ", age=" + age + ", email="
				+ email + ", number=" + number + "]";
	}
	

}
