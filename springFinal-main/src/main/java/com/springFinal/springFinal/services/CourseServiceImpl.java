package com.springFinal.springFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springFinal.springFinal.dao.CourseDao;
import com.springFinal.springFinal.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao courseDao;

	@Override
	public List<Course> getCourse() {
		// TODO Auto-generated method stub
		return courseDao.findAll();
	}

	@SuppressWarnings("deprecation")
	@Override
	public Course getCourse(int courseId) {
		return courseDao.getOne(courseId);
	}
	@Override
	public Course addCourse(Course course) {
		courseDao.save(course);
		return course;
	}	
	@Override
	public Course updateCourse(Course course) {
		courseDao.save(course);
		return course;
	}
	
		
	@SuppressWarnings("deprecation")
	@Override
	public Course deleteCourse(int parseInt) {
		Course entity=courseDao.getOne(parseInt);
	    courseDao.delete(entity);
		return entity;
	}
	
}
