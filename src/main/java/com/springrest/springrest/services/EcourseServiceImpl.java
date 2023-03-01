package com.springrest.springrest.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EcourseDao;
import com.springrest.springrest.entities.ecourse;


@Service
public class EcourseServiceImpl implements EcourseService {
	@Autowired
	private EcourseDao ecoursedao;

	@Override
	public List<ecourse> getEcourses(){
		return ecoursedao.findAll();
	}

	@Override
	@SuppressWarnings("deprecation")
	public ecourse getEcourse(int ecourseId) {
		return ecoursedao.getOne(ecourseId);
	}
   
	@Override
	public ecourse addEcourse(ecourse ecourse) {
		ecoursedao.save(ecourse);
		return ecourse;
	}

	@Override
	public ecourse updateEcourse(ecourse ecourse) {
		
		ecoursedao.save(ecourse);
		return ecourse;
	}

	@Override
	public void deleteEcourse(int parseInt) {
		@SuppressWarnings("deprecation")
		ecourse entity = ecoursedao.getOne(parseInt);
		ecoursedao.delete(entity);
		
		
	}
}
