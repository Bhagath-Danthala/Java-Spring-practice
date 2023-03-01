package com.example.employee;

import com.example.organization.Organization;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Employee {
	@ManyToOne
    @JoinColumn(name = "organization_id")
    private Organization organization;

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	
}
