package com.thoughtworks.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AutoConfigurationPackage
public class IflixApplication {

	public static void main(String[] args) {
		SpringApplication.run(IflixApplication.class, args);
	}

}
