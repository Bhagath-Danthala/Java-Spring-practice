package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.ecourse;

public interface EcourseService {

	public List<ecourse> getEcourses();
	public ecourse getEcourse(int ecourseId);
	public ecourse addEcourse(ecourse ecourse);
	public ecourse updateEcourse(ecourse ecourse);
	public void deleteEcourse(int parseInt);
}