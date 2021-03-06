package com.learning.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackages = "com.learning.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);

		System.out.println("Hello world");
	}

}
