package com.organization.details;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {
    @Autowired
    private OrganizationRepository organizationRepository;
    
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @GetMapping
    public List<Organization> getOrganizations() {
        return organizationRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Organization getOrganization(@PathVariable Long id) {
        return organizationRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Organization not found"));
    }
    
    @GetMapping("/{id}/employees")
    public List<Employee> getEmployees(@PathVariable Long id) {
        return employeeRepository.findByOrganizationId(id);
    }
}