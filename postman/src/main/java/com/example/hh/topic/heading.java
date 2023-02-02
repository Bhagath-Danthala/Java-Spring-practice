package com.example.hh.topic;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class heading {
	@RequestMapping("/topic")
	public String sayHi() {
		return "hi";
	}

}
