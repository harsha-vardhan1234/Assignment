package com.react.Simple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class DataControl {
	@Autowired
	DataService serve;
	
	@PostMapping("/insert")
	public String insert(@RequestBody Data data) {
		return serve.save(data);
	}
	@GetMapping("/fetch/{id}")
	public Data fetch(@PathVariable int id) {
		return serve.fetchById(id);
	}
	@GetMapping("/fetchall")
	public List<Data> fetchall(){
		return serve.fetchAll();
	}
	@PostMapping("/update/{id}/{name}")
	public Data update(@PathVariable int id,@PathVariable String name) {
		return serve.updateData(id, name);
	}
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return serve.deleteById(id);
	}

}
