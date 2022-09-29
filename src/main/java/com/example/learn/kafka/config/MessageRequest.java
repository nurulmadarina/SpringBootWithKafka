package com.example.learn.kafka.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageRequest {
	
	@JsonProperty("message")
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
