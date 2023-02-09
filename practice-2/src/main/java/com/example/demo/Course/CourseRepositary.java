package com.example.demo.Course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepositary extends CrudRepository<Course, String> {
	
	public List<Course> findByTopicId(String topicId);
	
}
