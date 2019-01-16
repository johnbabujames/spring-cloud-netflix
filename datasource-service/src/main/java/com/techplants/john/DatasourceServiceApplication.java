package com.techplants.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DatasourceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasourceServiceApplication.class, args);
	}

}

