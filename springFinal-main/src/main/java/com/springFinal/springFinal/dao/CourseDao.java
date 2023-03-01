package com.springFinal.springFinal.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springFinal.springFinal.entities.Course;

public interface CourseDao extends JpaRepository <Course, Integer> {

}
