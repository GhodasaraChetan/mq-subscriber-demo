package com.example.mqsubscriberdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(TestChannel.class)
public class MqSubscriberDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MqSubscriberDemoApplication.class, args);
	}

}

