package com.example.sample.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Consumer {
	
	@KafkaListener(topics="city-topic",groupId="kafkatemp")
	public void consumeMessage(String message) {
		System.out.println("Consumed message from Producer" + message);
	}

}
