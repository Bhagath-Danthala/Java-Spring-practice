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

import com.springFinal.springFinal.entities.Organization;
import com.springFinal.springFinal.services.Org_Service;

@RestController
public class OrgController {
	
	@Autowired
	private Org_Service org_Service;
	
//	@GetMapping("/home")
//	public String home()                  //function
//	{
//		
//		return "Welcome to courses application";
//	}
	
	
	
	
    //get the org
    @GetMapping("/org_name")

	
    public List<Organization> getOrg(){
	return this.org_Service.getOrg();
}



    //single courses get
    @GetMapping("/org/{org_Id}")
    public Organization getOrg(@PathVariable String org_Id) {
    	return this.org_Service.getOrg(Integer.parseInt(org_Id));
    	
    }	
    	
    //org add
    @PostMapping("/org")
    public Organization addOrg(@RequestBody Organization org ) {
    	return this.org_Service.addOrg(org);
    }
    	
    	
    //update org using Put request
    @PutMapping("/org")
    public Organization updateOrg(@RequestBody Organization org) {
    	return this.org_Service.updateOrg(org);
    	
    }
    
    
    //delete the org
    @DeleteMapping("/org/{org_Id}")
    public void deleteOrg(@PathVariable String org_Id) {
        return ; //this.courseService.deleteCourse(org_Id);
     }
}
