package com.Boot.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@Autowired
	private Repository repository;
	
	@GetMapping("/get/{id}")
	public List<bikedetails> geti(@PathVariable int id){
		return repository.findByIdLessThan(id);
	}
	
	@GetMapping("/get//{cost}")
	public Optional<bikedetails> getc(@PathVariable long cost){
		return repository.findByCost(cost);
	}
	@GetMapping("/get/{id}/{cost}")
	
	public Optional<bikedetails> getip(@PathVariable int id,@PathVariable long cost){
		return repository.findByIdOrCost(id, cost);
	}
	
	
	@GetMapping("/getall")
	public List<bikedetails> get(){
		
		return repository.findAll();
	}
	
	@PostMapping("/save")
	public bikedetails saveB(@RequestBody bikedetails bikedetails){
		
		return repository.save(bikedetails);
	}
	
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
	
		
			repository.deleteById(id);
			
	}
	@DeleteMapping("/delete")
	public void deleteall() {
		repository.deleteAll();
	}
	
	@PutMapping("/up/{id}")
	public bikedetails update(@RequestBody bikedetails bikedetails) {
		
		return repository.save(bikedetails);
	}
	
		
	
	
}
