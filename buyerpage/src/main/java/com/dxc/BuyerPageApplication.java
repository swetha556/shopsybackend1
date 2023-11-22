package com.dxc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//This annotation is used to mark the main class of a Spring Boot application.
//It encapsulates @SpringBootConfiguration, @EnableAutoConfiguration, and @ComponentScan annotations with their default attributes.
@EnableEurekaClient
public class BuyerPageApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuyerPageApplication.class, args);
		System.out.println("Buyer page Started");
	}

	@Bean
	protected RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
}
