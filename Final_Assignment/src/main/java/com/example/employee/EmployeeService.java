package com.example.employee;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeRepository employeeRepository;

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElseThrow();
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public Employee updateEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public void deleteEmployeeById(Long id) {
        employeeRepository.deleteById(id);
    }

	public List<Employee> getEmployeesByOrganizationId(Long organizationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
