package com.springFinal.springFinal.services;

import java.util.List;

import com.springFinal.springFinal.entities.Organization;

public interface Org_Service {
	
	
	public List<Organization> getOrg();
	
	public Organization getOrg(int org_Id) ;
	
	public Organization addOrg(Organization org) ;
	
	public Organization updateOrg(Organization org) ;
	
	public Organization deleteOrg(int parseInt) ;
	
	

}


