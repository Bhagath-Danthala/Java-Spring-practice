package com.springFinal.springFinal.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springFinal.springFinal.entities.Employee;
import com.springFinal.springFinal.services.Empl_Service;

@RestController
public class EmplController {
	
	@Autowired
	private Empl_Service empl_Service;
	
//	@GetMapping("/home")
//	public String home()                  //function
//	{
//		
//		return "Welcome to courses application";
//	}
	
	
	
	
    //get the org
    @GetMapping("/empl_name")
    public List<Employee> getEmpl(){
	return this.empl_Service.getEmpl();
}



    //single courses get
    @GetMapping("/empl/{empl_Id}")
    public Employee getEmpl(@PathVariable String empl_Id) {
    	return this.empl_Service.getEmpl(Integer.parseInt(empl_Id));
    	
    }	
    	
    //empl add
    @PostMapping("/empl")
    public Employee addEmpl(@RequestBody Employee empl ) {
    	return this.empl_Service.addEmpl(empl);
    }
    	
    	
    //update empl using Put request
    @PutMapping("/empl")
    public Employee updateEmpl(@RequestBody Employee empl) {
    	return this.empl_Service.updateEmpl(empl);
    	
    }
    
    
    //delete the empl
    @DeleteMapping("/empl/{empl_Id}")
    public void deleteEmpl(@PathVariable String empl_Id) {
        return ; //this.courseService.deleteEmpl(empl_Id);
     }
}