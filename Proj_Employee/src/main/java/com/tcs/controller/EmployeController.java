package com.tcs.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.employee.Employee;

@RestController
public class EmployeController {
    
	@GetMapping("/welcome")
	public String welCome() {
		return "Welcome to api";
	}
	
	@GetMapping("/getAllEmp")
	public List<Employee> getAllEmployee(){
		
	 Employee emp1=new Employee(1,"R000","Ram","Delhi");	
	 Employee emp2=new Employee(2,"S111","Shyam","Mumbai");
	 Employee emp3=new Employee(3,"R222","Radha","Patna");
	 Employee emp4=new Employee(4,"S333","Sita","Kolkata");
	 Employee emp5=new Employee(5,"R444","raju","hyderabad");
		
	 List<Employee> empList=new ArrayList<Employee>();
	 empList.add(emp1);
	 empList.add(emp2);
	 empList.add(emp3);
	 empList.add(emp4);
	 empList.add(emp5);
     
	 return empList;
		
	}
	
}
