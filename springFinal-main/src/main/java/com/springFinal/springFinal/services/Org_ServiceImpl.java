package com.springFinal.springFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springFinal.springFinal.dao.Org_Dao;

import com.springFinal.springFinal.entities.Organization;


@Service

public class Org_ServiceImpl implements Org_Service {
	
	
	@Autowired
	private Org_Dao org_Dao;

	public List<Organization> getOrg() {
		// TODO Auto-generated method stub
		return org_Dao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Organization getOrg(int org_Id) {
		// TODO Auto-generated method stub
		return org_Dao.getOne(org_Id);
	}

	@Override
	public Organization addOrg(Organization org) {
		// TODO Auto-generated method stub
		org_Dao.save(org);
		return org;
		
	}

	@Override
	public Organization updateOrg(Organization org) {
		// TODO Auto-generated method stub
		org_Dao.save(org);
		return org;
	}

	@Override
	public Organization deleteOrg(int parseInt) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Organization entity=org_Dao.getOne(parseInt);
		org_Dao.save(entity);
		return entity;
		
	}

}
