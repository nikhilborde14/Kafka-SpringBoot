package com.example.sample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {
	
	public static final String TOPIC= "city-topic";
	@Autowired
	KafkaTemplate<String, String> kafkatemp;
	
	public void sendToTopic(String message) {
		kafkatemp.send(TOPIC, message);
	}

}
