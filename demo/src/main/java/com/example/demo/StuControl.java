package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/students")
public class StuControl {
	 @Autowired
	    private StuService service;

	    @PostMapping("/stu")
	    public Stu save(@RequestBody Stu s) {
	        return service.save(s);
	    }
	    @PostMapping("/studen")
	    public List<Stu> saveall(@RequestBody List<Stu> s) {
	        return service.savea(s);
	    }
	    @GetMapping("/students")
	    public List<Stu> getAll() {
	        return service.getAll();
	    }
	    
	    @GetMapping("stude/{id}")
	    public Stu getStudent(@PathVariable int  id) {
	        return service.getById(id);
	    }
	    @DeleteMapping("stdelete/{id}")
	    public String deleteStudent(@PathVariable int  id) {
	        return service.deleteById(id);
	    }
}
