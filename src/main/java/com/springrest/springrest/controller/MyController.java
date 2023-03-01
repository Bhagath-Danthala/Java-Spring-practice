package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.entities.ecourse;
import com.springrest.springrest.entities.employee;
import com.springrest.springrest.entities.organizations;

import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.EcourseService;
import com.springrest.springrest.services.EmployeeService;
import com.springrest.springrest.services.OrganizationsService;

@RestController
public class MyController {

	@Autowired
	private CourseService Courseservice;
	
	@Autowired
	private EcourseService Ecourseservice;
	
	@Autowired
	private EmployeeService Employeeservice;
	
	@Autowired
	private OrganizationsService Organizationsservice;
	
	
	@GetMapping("/home")
	public String home() {
	return"Welcome to courses application";
	}
	
	
	@GetMapping( "/courses" )
	public List<course> getCourses(){
		return this.Courseservice.getCourses();
	}
	@GetMapping("/courses/{courseId}")
	public course getCourse(@PathVariable String courseId) {
		return this.Courseservice.getCourse(Long.parseLong(courseId));
	}
	@PostMapping( "/courses" )
	public course addCourse(@RequestBody course course) {
		return this.Courseservice.addCourse(course);
	}
	@PutMapping( "/courses" )
	public course updateCourse(@RequestBody course course) {
	return this.Courseservice.updateCourse(course);}
	
	@DeleteMapping("/courses/{courseId}")
	public ResponseEntity<HttpStatus>deleteCourse(@PathVariable String courseId){
		try {
			this.Courseservice.deleteCourse(Long.parseLong(courseId ));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping( "/emp_courses" )
	public List<ecourse> getEcourses(){
		return this.Ecourseservice.getEcourses();
	}
	@GetMapping("/emp_courses/{emp_courseId}")
	public ecourse getEcourse(@PathVariable String ecourseId) {
		return this.Ecourseservice.getEcourse(Integer.parseInt(ecourseId));
	}
	@PostMapping( "/emp_courses" )
	public ecourse addCourse(@RequestBody ecourse ecourse) {
		return this.Ecourseservice.addEcourse(ecourse);
	}
	@PutMapping( "/emp_courses" )
	public ecourse updateCourse(@RequestBody ecourse ecourse) {
	return this.Ecourseservice.updateEcourse(ecourse);}
	
	@DeleteMapping("/emp_courses/{emp_courseId}")
	public ResponseEntity<HttpStatus>deleteEcourse(@PathVariable String ecourseId){
		try {
			this.Ecourseservice.deleteEcourse(Integer.parseInt(ecourseId ));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping( "/employee" )
	public List<employee> getEmployees(){
		return this.Employeeservice.getEmployees();
	}
	@GetMapping("/employee/{employeeId}")
	public employee getEmployee(@PathVariable String employeeId) {
		return this.Employeeservice.getEmployee(Integer.parseInt(employeeId));
	}
	@PostMapping( "/employee" )
	public employee addEmployee(@RequestBody employee employee) {
		return this.Employeeservice.addEmployee(employee);
	}
	@PutMapping( "/employee" )
	public employee updateEmployee(@RequestBody employee employee) {
	return this.Employeeservice.updateEmployee(employee);}
	
	@DeleteMapping("/employee/{employeeId}")
	public ResponseEntity<HttpStatus>deleteEmployee(@PathVariable String employeeId){
		try {
			this.Employeeservice.deleteEmployee(Integer.parseInt(employeeId ));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	@GetMapping( "/organizations" )
	public List<organizations> getOrganizations(){
		return this.Organizationsservice.getOrganizations();
	}
	@GetMapping("/organizations/{organizationsId}")
	public organizations getOrganization(@PathVariable String organizationsId) {
		return this.Organizationsservice.getOrganization(Integer.parseInt(organizationsId));
	}
	@PostMapping( "/organizations" )
	public organizations addOrganization(@RequestBody organizations organizations) {
		return this.Organizationsservice.addOrganization(organizations);
	}
	@PutMapping( "/organizations" )
	public organizations updateOrganization(@RequestBody organizations organizations) {
	return this.Organizationsservice.updateOrganization(organizations);}
	
	@DeleteMapping("/organizations/{organizationsId}")
	public ResponseEntity<HttpStatus>deleteOrganization(@PathVariable String organizationsId){
		try {
			this.Organizationsservice.deleteOrganization(Integer.parseInt(organizationsId ));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	
}
