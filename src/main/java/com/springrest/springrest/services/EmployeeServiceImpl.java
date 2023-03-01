package com.springrest.springrest.services;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao employeedao;

	
	 
	
	@Override
	public List<employee> getEmployees(){
		return employeedao.findAll();
	}

	@Override
	@SuppressWarnings("deprecation")
	public employee getEmployee(int employeeId) {

		return employeedao.getOne(employeeId);
	}
   
	@Override
	public employee addEmployee(employee employee) {
	
		employeedao.save(employee);
		return employee;
	}

	@Override
	public employee updateEmployee(employee employee) {
		
		employeedao.save(employee);
		return employee;
	}

	@Override
	
	public void deleteEmployee(int parseInt) {
		@SuppressWarnings("deprecation")
		employee entity = employeedao.getOne(parseInt);
		employeedao.delete(entity);
		
		
	}
}
