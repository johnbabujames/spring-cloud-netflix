package com.techplants.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ParameterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParameterServiceApplication.class, args);
	}

}

