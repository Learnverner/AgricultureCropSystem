package com.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class Que5RestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(Que5RestCrudApplication.class, args);
	}

}
