package com.springrest.springrest.entities;

public class course {
	private long id;
	private String name;
	private String desp;
	
	public course(long id, String name, String desp) {
		super();
		this.id = id;
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
		return "course [id=" + id + ", name=" + name + ", desp=" + desp + "]";
	}
	

}
