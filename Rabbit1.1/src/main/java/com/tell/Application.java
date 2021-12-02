package com.tell;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tell.config.RabbitMQConfiguration;
import com.tell.config.product.Product;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private RabbitTemplate rabbitTemplate;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Product product=new Product();
		product.setProductId(101);
		product.setName(" Sony Laptop");
		product.setQuantity(20);
		System.out.println("Sending message.....");
		rabbitTemplate.convertAndSend(RabbitMQConfiguration.topicExchangeName,"message_routing_key",product);
		System.out.println("Message sent successfully......");
		
	}

}
