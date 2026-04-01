package com.example.Annotation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class WorkService {
	@Autowired
	WorkRepository repo;
	public Work saving(Work w) {
	return 	repo.save(w);
	}
	public List<Work> fetchall(){
		return repo.findAll();
	}
	
	public Work getById(int id) {
        Optional<Work> optional = repo.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Worker  not found with id: " + id);
        }
    }
	 public String deleteById(int  id) {
	        if (repo.existsById(id)) {
	            repo.deleteById(id);
	            return "work deleted with id: " + id;
	        } else {
	            return "work not found";
	        }
	      
	    }

}
