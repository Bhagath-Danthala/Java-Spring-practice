package com.example.organization;

import java.util.ArrayList;
import java.util.List;

import com.example.employee.Employee;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String code;

    private String description;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Employee> employees;

    @OneToMany(mappedBy = "organization", cascade = CascadeType.ALL)
    private List<Course> courses;

    // constructors, getters, and setters

    public Organization() {}

    public Organization(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
        this.employees = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}
