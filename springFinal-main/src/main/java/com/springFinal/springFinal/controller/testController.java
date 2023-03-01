package com.springFinal.springFinal.controller;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.*;
@RestController
public class testController {
	
	@GetMapping("/home")
	public String home()                  //function
	{
		
		return "Welcome to courses application";
	}
	

}
