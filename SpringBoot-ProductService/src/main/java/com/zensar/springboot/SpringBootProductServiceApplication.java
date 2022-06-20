package com.zensar.springboot;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootProductServiceApplication {

	public static void main(String[] args) {
		System.out.println("Ram");
		SpringApplication.run(SpringBootProductServiceApplication.class, args);

		System.out.println("Laxman");

	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
		
	}

}
