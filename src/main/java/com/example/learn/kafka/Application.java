package com.example.learn.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return arg -> {
			for (int i = 0; i < 50; i++) {
				kafkaTemplate.send("test_nurul", "Hello Kafka :) => "+ i);
			}
		};
	}
}
