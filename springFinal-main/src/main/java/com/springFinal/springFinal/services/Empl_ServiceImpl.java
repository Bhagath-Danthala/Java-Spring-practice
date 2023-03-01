package com.springFinal.springFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springFinal.springFinal.dao.Empl_Dao;
import com.springFinal.springFinal.entities.Employee;

@Service


public class Empl_ServiceImpl implements Empl_Service {
	
	@Autowired
	private Empl_Dao empl_Dao;
	
    
	public List<Employee> getEmpl() {
		// TODO Auto-generated method stub
		return empl_Dao.findAll();
	}
    @Override
	@SuppressWarnings("deprecation")
	public  Employee getEmpl (int empl_Id) {
		// TODO Auto-generated method stub
		return empl_Dao.getOne(empl_Id);
	}

	@Override
	public Employee addEmpl(Employee empl) {
		// TODO Auto-generated method stub
		empl_Dao.save(empl);
		return empl;
	}

	@Override
	public Employee updateEmpl(Employee empl) {
		// TODO Auto-generated method stub
		empl_Dao.save(empl);
		return empl;
	}

	@Override
	public Employee deleteEmpl(int parseInt) {
		// TODO Auto-generated method stub
		@SuppressWarnings("deprecation")
		Employee entity=empl_Dao.getOne(parseInt);
		empl_Dao.save(entity);
		return entity;
	}


}
