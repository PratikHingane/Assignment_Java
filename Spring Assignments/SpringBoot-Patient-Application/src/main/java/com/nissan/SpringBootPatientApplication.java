package com.nissan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootPatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPatientApplication.class, args);
		System.out.println("Spring is Running...");
	}

}
