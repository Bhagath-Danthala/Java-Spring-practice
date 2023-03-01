package com.organization.details;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
	public class Organization {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(nullable = false)
	    private String name;
	    
	    @Column(nullable = false)
	    private String code;
	    
	    @Column(nullable = false)
	    private String description;
	    
	    @OneToMany(mappedBy = "organization")
	    private List<Employee> employees;
	    
	    
	}

	
	    
	    

	


