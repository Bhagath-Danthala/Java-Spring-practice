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
@RequestMapping("/api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    
    @Autowired
    private CourseCompletionRepository courseCompletionRepository;
    
    @GetMapping
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Employee not found"));
    }
    
    @GetMapping("/{id}/course-completions")
    public List<CourseCompletionRepository> getCourseCompletion(){
    	return CourseCompletionRepository.findAll();
    	
    }
}