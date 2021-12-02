package com.tell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class EurekaWithApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaWithApiGatewayApplication.class, args);
	}

}
