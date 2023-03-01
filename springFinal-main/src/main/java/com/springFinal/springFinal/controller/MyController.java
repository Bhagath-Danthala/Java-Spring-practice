package com.springFinal.springFinal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springFinal.springFinal.entities.Course;
import com.springFinal.springFinal.services.CourseService;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/home")
	public String home()                  //function
	{
		
		return "Welcome to courses application";
	}
	
	
	
	
    //get the courses
    @GetMapping("/courses")

	
    public List<Course> getCourses(){
	return this.courseService.getCourse();
}



    //single courses get
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
    	return this.courseService.getCourse(Integer.parseInt(courseId));
    	
    }	
    	
    //course add
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course ) {
    	return this.courseService.addCourse(course);
    }
    	
    	
    //update course using Put request
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
    	return this.courseService.updateCourse(course);
    	
    }
    
    
    //delete the course
    @DeleteMapping("/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId) {
        return ; //this.courseService.deleteCourse(courseId);
     }
}




