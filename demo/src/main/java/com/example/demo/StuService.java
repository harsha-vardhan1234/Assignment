package com.example.demo;

import java.util.List;

import java.util.Optional;

//import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class StuService {
	@Autowired
    private StuRepoditory repo;

    public Stu save(Stu s) {
        return repo.save(s);
    }

    public List<Stu> getAll() {
        return repo.findAll();
    }
    public Stu getById(int id) {
        Optional<Stu> optional = repo.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("Student not found with id: " + id);
        }
    }
    public String deleteById(int  id) {
        if (repo.existsById(id)) {
            repo.deleteById(id);
            return "Student deleted with id: " + id;
        } else {
            return "Student not found";
        }
      
    }
    public List<Stu> savea(List<Stu> s) {
    	return repo.saveAll(s);
    }

}
