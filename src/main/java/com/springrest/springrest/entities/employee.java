package com.springrest.springrest.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpa_employee")
public class employee{
	@Id
	private int id;
	private String name;
	private int Eid;
	private String Address;
	private String Email;
	private String contact;
	private String oid;
	
	@ManyToMany(mappedBy = "employee", cascade =CascadeType.ALL)
	private List<course> course=new ArrayList<>();
	
	
	@ManyToOne
	private List<organizations> organization=new ArrayList<>();
	
	public employee(int id, String name, int eid, String address, String email, String contact, String oid) {
		super();
		this.id = id;
		this.name = name;
		this.Eid = eid;
		Address = address;
		Email = email;
		this.contact = contact;
		this.oid = oid;
	}
	public employee() {
		super();
		// TODO Auto-generated constructor stub
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
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", Eid=" + Eid + ", Address=" + Address + ", Email=" + Email
				+ ", contact=" + contact + ", oid=" + oid + "]";
	}
	
	
}