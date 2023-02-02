package com.springrest.springrest.services;

import java.util.ArrayList;


import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	
	
	List<Course> list;
	
	public CourseServiceImpl() {
		
		list=new ArrayList<>();
		list.add(new Course(145, "Java","Basics of java"));
		list.add(new Course(200,"Python","Basics of python"));
		
	}

	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=new Course();
				for(Course course:list) 
				{
					if (course.getId()== courseId) {
						c=course;
						break;
					}
				}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

	/*@Override
	public Course updateCourse(Course course ) {
		// TODO Auto-generated method stub
		Course c=null;
		
		for(Course newcourse:list) 
		{
			if (newcourse.getId()== course.getId()); {
				c=newcourse;
				break;
			}
		}
return c;
	}*/

	@Override
	public String updateCourse( Course course) {
		// TODO Auto-generated method stub
		for (int i=0; i<list.size();i ++) {
			Course c =list.get(i);
			
			if(c.getId()==course.getId() ) {
				list.set(i, course);
				return "Course updated successfully!";
			}
	}
		return "course not found!";
	}
	@Override
	public Course deleteCourse(String courseId) {
		 //TODO Auto-generated method stub
		
		for(Course course:list) 
		{
			if (course.getId()== Long.parseLong(courseId)) {
				list.remove(course);
				return course;
			}
		}
		
		return null; 
	}

}
