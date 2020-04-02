package com.tutorialspoint.myfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class MyfirstwebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebappApplication.class, args);
	}


	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World";
	}

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
