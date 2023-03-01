package com.springrest.springrest.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jpa_orgnization")

public class organizations{
	@Id
	private int id;
	private String OName;
	private String OCode;
	private String Desc;
	
	@OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
	private List<employee> employee=new ArrayList<>();
	
	
	public organizations(int id, String oName, String oCode, String desc) {
		super();
		this.id = id;
		OName = oName;
		OCode = oCode;
		Desc = desc;
	}
	
	public organizations() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOName() {
		return OName;
	}
	public void setOName(String oName) {
		OName = oName;
	}
	public String getOCode() {
		return OCode;
	}
	public void setOCode(String oCode) {
		OCode = oCode;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}

	@Override
	public String toString() {
		return "organizations [id=" + id + ", OName=" + OName + ", OCode=" + OCode + ", Desc=" + Desc + "]";
	}
	
	
}
