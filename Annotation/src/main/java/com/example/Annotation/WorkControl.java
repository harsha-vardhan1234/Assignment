package com.example.Annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/work")
public class WorkControl {
@Autowired
WorkService work;
@PostMapping
public Work insert(@RequestBody Work w) {
	return work.saving(w);
}
@GetMapping
public List<Work> fetch(){
	return work.fetchall();
}
@GetMapping("/{id}")
public Work fetchid(@PathVariable int  id) {
	return work.getById(id);
}
@DeleteMapping("/{id}")
public String delete(@PathVariable int id) {
 return work.deleteById(id);	
}
}
