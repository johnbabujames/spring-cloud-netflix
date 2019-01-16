package com.techplants.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PreviewServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PreviewServiceApplication.class, args);
	}

}

