package com.springrest.springrest.contoller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

import java.util.*;

@RestController
public class MyController                 //class
{
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()                  //function
	{
		
		return "Welcome to courses application";
	}
	
	//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()   //function
	{  
		return this.courseService.getCourses();
		
	}
	//get the courseId
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{return this.courseService.getCourse(Long.parseLong(courseId));
	
	}
	@PostMapping("/courses/{courseId}")
	public Course addCourse(@RequestBody Course course){
		
	
	return this.courseService.addCourse(course);

	}
	//update a course
	@PutMapping("/courses")
	public String updateCourse(@RequestBody Course course) /*@PathVariable String id)*/
	{
		String result=courseService.updateCourse( course);
		return result;
	
	}
	//delete a course
	@DeleteMapping("/courses/{courseId}")
	public Course  deleteCourse(@PathVariable String courseId)
	{
		Course result=courseService.deleteCourse(courseId);
		return result;
	}
}
