package com.starter.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StaterServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaterServiceApplication.class, args);
	}

}
