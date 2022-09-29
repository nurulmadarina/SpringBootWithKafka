package com.example.learn.kafka.config;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

	@KafkaListener(topics = "test_nurul", groupId = "groupId")
	void listener(String data) {
		System.out.println("Listener received: " + data);
	}
}
