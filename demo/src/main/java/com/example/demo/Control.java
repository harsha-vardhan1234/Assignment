package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@PostMapping("/student")
	public String display(@RequestParam String name) {
		return "name is "+ name;
		
	}
	

}
