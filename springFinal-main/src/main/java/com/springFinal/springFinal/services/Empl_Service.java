package com.springFinal.springFinal.services;


import java.util.List;

import com.springFinal.springFinal.entities.Employee;

public interface Empl_Service {
	
	
	public List<Employee> getEmpl();
	
	public Employee getEmpl(int empl_Id) ;
	
	public Employee addEmpl(Employee empl) ;
	
	public Employee updateEmpl(Employee empl) ;
	
	public Employee deleteEmpl(int parseInt) ;
	
	

}
