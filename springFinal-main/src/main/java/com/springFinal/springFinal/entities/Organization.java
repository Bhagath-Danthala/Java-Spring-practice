package com.springFinal.springFinal.entities;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Organization_Table")
public class Organization {
	@Id
	private int id;
	private String Org_Code;
	private  String Org_Name;
	private String Desc;
	public Organization(int id, String org_Code, String org_Name, String desc) {
		super();
		this.id = id;
		Org_Code = org_Code;
		Org_Name = org_Name;
		Desc = desc;
		
		

	}
	public Organization() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOrg_Code() {
		return Org_Code;
	}
	public void setOrg_Code(String org_Code) {
		Org_Code = org_Code;
	}
	public String getOrg_Name() {
		return Org_Name;
	}
	public void setOrg_Name(String org_Name) {
		Org_Name = org_Name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", Org_Code=" + Org_Code + ", Org_Name=" + Org_Name + ", Desc=" + Desc
				+ ", getId()=" + getId() + ", getOrg_Code()=" + getOrg_Code() + ", getOrg_Name()=" + getOrg_Name()
				+ ", getDesc()=" + getDesc() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
//many employees:
	@OneToMany (mappedBy="organization",cascade= CascadeType.ALL)
	List<Employee> employeeList=new ArrayList<>();
	
	
	
}
