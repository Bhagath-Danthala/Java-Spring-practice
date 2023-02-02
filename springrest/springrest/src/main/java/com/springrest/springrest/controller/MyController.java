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
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {

	@Autowired
	private CourseService Courseservice;
	
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
}
