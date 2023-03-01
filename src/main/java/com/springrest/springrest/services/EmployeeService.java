package com.springrest.springrest.services;

import java.util.List;
import com.springrest.springrest.entities.employee;

public interface EmployeeService {

	public List<employee> getEmployees();
	public employee getEmployee(int employeeId);
	public employee addEmployee(employee employee);
	public employee updateEmployee(employee employee);
	public void deleteEmployee(int parseint);
}