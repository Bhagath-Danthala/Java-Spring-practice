package com.organization.details;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseCompletionRepository extends JpaRepository<CourseCompletion, Long> {
    List<CourseCompletion> findByEmployeeId(Long employeeId);
}

