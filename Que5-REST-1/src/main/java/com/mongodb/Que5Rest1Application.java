package com.mongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.repository.Repository;

import com.mongodb.data.EmployeeDomainModel;
import com.mongodb.repo.EmployeeRepository;

@SpringBootApplication
@EnableMongoRepositories
public class Que5Rest1Application implements CommandLineRunner {
	@Autowired
	public EmployeeRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(Que5Rest1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

//	@Override
//	public void run(String... args) throws Exception {
//	EmployeeDomainModel e1=new EmployeeDomainModel("1","Pratiksha Bhosale","Electrical","Developer","20000");
//	EmployeeDomainModel e2=new EmployeeDomainModel("2","Piyush Mendhe","CS","Developer","35000");
//	EmployeeDomainModel e3=new EmployeeDomainModel("3","Pratiksha Sawant","IT","Developer","38000");
//	EmployeeDomainModel e4=new EmployeeDomainModel("4","Shweta Chobhe","Electrical","Developer","18000");
//		repo.save(e1);
//		repo.save(e2);
//		repo.save(e3);
//		repo.save(e4);
//		System.out.println("********************************");
//		List<EmployeeDomainModel>model=repo.findAll();
//		for(EmployeeDomainModel m:model) {
//			System.out.println(m.toString());
//		}
	}


