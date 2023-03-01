package com.example.organization;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Course.CourseService;
import com.example.employee.Employee;
import com.example.employee.EmployeeService;


@RestController
@RequestMapping("/api/organizations")
public class OrganizationController {
    private OrganizationService organizationService;
    private EmployeeService employeeService;
    private CourseService courseService;

    public OrganizationController(OrganizationService organizationService, EmployeeService employeeService, CourseService courseService) {
        this.organizationService = organizationService;
        this.employeeService = employeeService;
        this.courseService = courseService;
    }

    @PostMapping
    public Organization createOrganization(@RequestBody Organization organization) {
        return organizationService.createOrganization(organization);
    }

    @GetMapping("/{organizationId}")
    public Organization getOrganizationById(@PathVariable Long organizationId) {
        return organizationService.getOrganizationById(organizationId);
    }

    @GetMapping("/{organizationId}/employees")
    public List<Employee> getEmployeesByOrganizationId(@PathVariable Long organizationId) {
        return employeeService.getEmployeesByOrganizationId(organizationId);
    }

    @GetMapping("/{organizationId}/courses")
    public List<Course> getCoursesByOrganizationId(@PathVariable Long organizationId) {
        return courseService.getCoursesByOrganizationId(organizationId);
    }
}

