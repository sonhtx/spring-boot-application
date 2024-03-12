package com.training.genin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GeninApplication {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(GeninApplication.class, args);
		System.out.println("Goodbye world");
	}

}
