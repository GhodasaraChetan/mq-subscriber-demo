package com.example.mqsubscriberdemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface TestChannel {

	String GOOGLE_CHANNEL = "google_channel";
	String MICROSOFT_CHANNEL = "microsoft_channel";

	@Input(GOOGLE_CHANNEL)
	SubscribableChannel receiveMessageForGoogle();

	@Input(MICROSOFT_CHANNEL)
	SubscribableChannel receiveMessageForMicrosoft();
}


