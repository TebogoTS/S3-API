package com.javas3.s3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FileStorageServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(FileStorageServiceApplication.class, args);
	}

	@GetMapping
	public String landingPage() {
		return "This is the landing page of the Java and SpringBoot Application by Tebogo";
	}

}
