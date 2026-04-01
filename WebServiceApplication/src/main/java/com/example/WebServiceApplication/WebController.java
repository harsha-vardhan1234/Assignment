package com.example.WebServiceApplication;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	@Autowired
	Webservice web;
	@GetMapping("/getdata")
	public List<Map<String, Object>> response() {
		return web.getPosts();
	}

}
