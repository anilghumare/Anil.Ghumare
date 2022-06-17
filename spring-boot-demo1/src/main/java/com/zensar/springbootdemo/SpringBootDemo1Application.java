package com.zensar.springbootdemo;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class SpringBootDemo1Application {

	/*
	 * @Override protected SpringApplicationBuilder
	 * configure(SpringApplicationBuilder builder) { // TODO Auto-generated method
	 * stub return super.configure(builder); }
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo1Application.class, args);
	}
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}

}
