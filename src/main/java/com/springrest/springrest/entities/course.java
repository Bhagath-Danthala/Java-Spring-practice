package com.springrest.springrest.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="jpa_course")


public class course {
	@Id
	private long id;
	private String name;
	private String code;
	private String desp;
	
	@ManyToMany
	private List<employee> employee= new ArrayList<>();
	
	public course(long id,String code, String name, String desp) {
		super();
		this.id = id;
		this.code=code;
		this.name = name;
		this.desp = desp;
	}

	public course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesp() {
		return desp;
	}

	public void setDesp(String desp) {
		this.desp = desp;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", CODE=" + code + ", name=" + name + ", desp=" + desp + "]";
	}
	

}
