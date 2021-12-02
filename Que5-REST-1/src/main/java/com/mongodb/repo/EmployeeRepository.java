package com.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongodb.data.EmployeeDomainModel;

public interface EmployeeRepository extends MongoRepository<EmployeeDomainModel,String> {

}
