package com.example.Course;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.organization.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    List<Course> findByOrganizationId(Long organizationId);

	com.example.Course.Course save(com.example.Course.Course course);

	List<Course> getCourseByOrganizationId();


}

