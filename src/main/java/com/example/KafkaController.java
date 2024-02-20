package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.sample.services.Producer;

@RestController
@RequestMapping("/kafkaapp")
public class KafkaController {
	
	@Autowired
	Producer producer;
	
	@GetMapping(value="/send")
	public String sendMessagetoTopic(@RequestParam("message")String message){
		producer.sendToTopic(message);
		return message;
	}

}
