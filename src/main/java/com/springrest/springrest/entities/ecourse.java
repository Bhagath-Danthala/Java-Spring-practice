package com.springrest.springrest.entities;



import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="jpa_ecourse")
public class ecourse{
	@Id
	private int eid;
	private int cid;
	private Boolean status;
	
	
	
	
	public ecourse(int eid, int cid, Boolean status) {
		super();
		this.eid = eid;
		this.cid = cid;
		this.status = status;
	}
	public ecourse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ecourse [eid=" + eid + ", cid=" + cid + ", status=" + status + "]";
	}
	
	
}