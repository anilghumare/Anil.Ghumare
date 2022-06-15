package com.zensar.springbootcoupon;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootCoupon1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoupon1Application.class, args);
	}
    @Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
