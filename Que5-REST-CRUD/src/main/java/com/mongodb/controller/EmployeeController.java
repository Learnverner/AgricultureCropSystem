package com.mongodb.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.model.Employee;
import com.mongodb.repo.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
@Autowired
private EmployeeRepository repo;
@PostMapping("/add")
public Employee addEmployee(@RequestBody Employee e) {

	Employee e1= repo.save(e);
	return e1;
	
}

public Optional<Employee> searchEmpByID(@PathVariable("id") String id){
	Optional<Employee> emp=repo.findById(id);
	return emp;
	}

@DeleteMapping("/delete/{id}")
public  String deleteEmpById(@PathVariable ("id") String id){
	repo.deleteById(id);
	return "Employee" + id + "deleted";
	
}

@GetMapping("/findall")
public List<Employee> findEmps(){
	
	return (List<Employee>) repo.findAll();
}


@PutMapping("/update")
public Employee updateEmp(@RequestBody Employee e) {
	
	Employee emp=repo.save(e);
	return emp;
}

}
