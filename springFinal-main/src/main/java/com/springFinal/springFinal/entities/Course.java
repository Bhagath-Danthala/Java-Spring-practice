package com.springFinal.springFinal.entities;



import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "Course_Table")

public class Course {
	
	@Id
	private int id;
	private String Code;
	private  String Name;
	private String Desc;
	public Course(int id, java.lang.String code, java.lang.String name , java.lang.String desc) {
		super();
		this.id = id;
		Code = code;
		Name = name;
		Desc = desc;
		
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", Code=" + Code + ", Name=" + Name + ", Desc=" + Desc + ", getId()=" + getId()
				+ ", getCode()=" + getCode() + ", getName()=" + getName() + ", getDesc()=" + getDesc() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
//many employees
	@ManyToMany(mappedBy = "courses",cascade = CascadeType.ALL)
	private List<Employee> employees=new ArrayList<>();

}
