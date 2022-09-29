package com.example.learn.kafka.config;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/learn/kafka")
public class MessageController {
	
	private KafkaTemplate<String,String> kafkaTemplate;
	
	public MessageController(KafkaTemplate<String, String> kafkaTemplate) {
		super();
		this.kafkaTemplate = kafkaTemplate;
	}

	@PostMapping("/producer")
	public void publish(@RequestBody MessageRequest request) {
		kafkaTemplate.send("test_nurul", request.getMessage());
	}

}
