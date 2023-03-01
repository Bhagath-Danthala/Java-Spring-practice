package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.organizations;

public interface OrganizationsService {

	public List<organizations> getOrganizations();
	public organizations getOrganization(int organizationsId);
	public organizations addOrganization(organizations organizations);
	public organizations updateOrganization(organizations organizations);
	public void deleteOrganization(int parseInt);
}