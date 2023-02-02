package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.course;


@Service
public class CourseServiceImpl implements CourseService {
	@Autowired
	private CourseDao coursedao;

	// List<course> list;
	 public CourseServiceImpl() {
		 //list = new ArrayList<>();
		 //list.add(new course(144,"Java Core","This contain basic java"));
		 //list.add(new course(112,"Python Core","This contain basic python"));
	 }
	
	@Override
	public List<course> getCourses(){
		return coursedao.findAll();
	}

	@Override
	public course getCourse(Long courseId) {
//		course c=null;
	//	for(course course:list ) {
		//	if(course.getId()==courseId) {
			//	c=course;
			//	break;
			//}
		//}
		return coursedao.getOne(courseId);
	}
   
	@Override
	public course addCourse(course course) {
	//	list.add(course);
		coursedao.save(course);
		return course;
	}

	@Override
	public course updateCourse(course course) {
		//list.forEach(e ->{
		//	if (e.getId()== course.getId()) {
		//		e.setName(course.getName());
		//		e.setDesp(course.getDesp());
		//	}
		//});
		coursedao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		course entity = coursedao.getOne(parseLong);
		coursedao.delete(entity);
		//list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
		
	}
}
