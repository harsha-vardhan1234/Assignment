package com.react.Simple;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class DataService {
	@Autowired
	DataRepository datarepo;
	//1.adding create
	public String save(Data data) {
		datarepo.save(data);
		return "data inserted ";
	}
	//2.fetch  read
	public List<Data> fetchAll(){
		return datarepo.findAll();
	}
	//3.fetch read
	public Data fetchById(int id) {
		Optional<Data> optional = datarepo.findById(id);

        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("data  not found with id: " + id);
        }
	}
	//4. deleting delete
	public String deleteById(int id) {
		if (datarepo.existsById(id)) {
            datarepo.deleteById(id);
            return "Student deleted with id: " + id;
        } else {
            return "Student not found";
        }
		
	}
	//5.updating update
		public Data updateData(int id,String name) {
	        return datarepo.findById(id).map(existingData -> {
	            existingData.setName(name);
	            
	            return datarepo.save(existingData);
	        }).orElseThrow(() -> new RuntimeException("Data not found with id: " + id));
	    }
	
		
}
	


