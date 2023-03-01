package com.example.Course;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/courses")
public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    // GET /api/courses
    @GetMapping
    public List<com.example.organization.Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // GET /api/courses/{courseId}
    @GetMapping("/{courseId}")
    public com.example.organization.Course getCourseById(@PathVariable Long courseId) {
        return courseService.getCourseById(courseId);
    }

    // POST /api/courses
    @PostMapping
    public Course createCourse(@RequestBody Course course) {
        return courseService.createCourse(course);
    }

    // PUT /api/courses/{courseId}
    @PutMapping("/{courseId}")
    public com.example.organization.Course updateCourse(@PathVariable Long courseId, @RequestBody Course course) {
        return courseService.updateCourse(courseId, course);
    }

    // DELETE /api/courses/{courseId}
    @DeleteMapping("/{courseId}")
    public void deleteCourse(@PathVariable Long courseId) {
        courseService.deleteCourse(courseId);
    }
}

