package com.springFinal.springFinal.services;

import java.util.List;

import com.springFinal.springFinal.entities.Course;

public interface CourseService {
	
	public List<Course> getCourse();
	
	public Course getCourse(int courseId) ;
	
	public Course addCourse(Course course) ;
	
	public Course updateCourse(Course course) ;
	
	public Course deleteCourse(int parseInt) ;
	
	

}
