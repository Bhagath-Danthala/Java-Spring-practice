package com.example.Course;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    public List<com.example.organization.Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public com.example.organization.Course getCourseById(Long courseId) {
        return courseRepository.findById(courseId)
                .orElseThrow();
    }

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public com.example.organization.Course updateCourse(Long courseId, Course course) {
        com.example.organization.Course existingCourse = courseRepository.findById(courseId)
                .orElseThrow();

        existingCourse.setCourseCode(course.getCourseCode());
        existingCourse.setCourseName(course.getCourseName());
        existingCourse.setDescription(course.getDescription());

        return courseRepository.save(existingCourse);
    }

    public void deleteCourse(Long courseId) {
        com.example.organization.Course course = courseRepository.findById(courseId)
                .orElseThrow();

        courseRepository.delete(course);
    }

	public List<com.example.organization.Course> getCoursesByOrganizationId(Long organizationId) {
		return courseRepository.getCourseByOrganizationId();
	}
}
