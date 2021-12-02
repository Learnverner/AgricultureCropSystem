package com.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongodb.model.Employee;

public interface EmployeeRepository extends MongoRepository<Employee,String>{

}
