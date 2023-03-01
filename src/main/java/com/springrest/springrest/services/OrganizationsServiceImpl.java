package com.springrest.springrest.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.OrganizationsDao;
import com.springrest.springrest.entities.organizations;


@Service
public class OrganizationsServiceImpl implements OrganizationsService {
	@Autowired
	private OrganizationsDao organizationsdao;

	
	 public OrganizationsServiceImpl() {
		
		 
	 }
	
	@Override
	public List<organizations> getOrganizations(){
		return organizationsdao.findAll();
	}

	@Override
	@SuppressWarnings("deprecation")
	public organizations getOrganization(int organizationsId) {

		return organizationsdao.getOne(organizationsId);
	}
   
	@Override
	public organizations addOrganization(organizations organizations) {
	
		organizationsdao.save(organizations);
		return organizations;
	}

	@Override
	public organizations updateOrganization(organizations organizations) {
	
		organizationsdao.save(organizations);
		return organizations;
	}

	@Override
	public void deleteOrganization(int parseInt) {
		@SuppressWarnings("deprecation")
		organizations entity = organizationsdao.getOne(parseInt);
		organizationsdao.delete(entity);
		
		
	}
}
