package com.springFinal.springFinal.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Employee_Table")
public class Employee {
	@Id
	private int id;
	private int Emp_Id;
	private String Name;
	private  String Address;
	private String Email;
	private String Contact_No;
	
//one organization
	@ManyToOne
	private Organization organization;
	
//many courses
	@ManyToMany
	private List<Course> courses=new ArrayList<>();
	
	public Employee(int id, int emp_Id, String name, String address, String email, String contact_No) {
		super();
		this.id = id;
		Emp_Id = emp_Id;
		Name = name;
		Address = address;
		Email = email;
		Contact_No = contact_No;
		

	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmp_Id() {
		return Emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		Emp_Id = emp_Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getContact_No() {
		return Contact_No;
	}
	public void setContact_No(String contact_No) {
		Contact_No = contact_No;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", Emp_Id=" + Emp_Id + ", Name=" + Name + ", Address=" + Address + ", Email="
				+ Email + ", Contact_No=" + Contact_No + ", getId()=" + getId() + ", getEmp_Id()=" + getEmp_Id()
				+ ", getName()=" + getName() + ", getAddress()=" + getAddress() + ", getEmail()=" + getEmail()
				+ ", getContact_No()=" + getContact_No() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
