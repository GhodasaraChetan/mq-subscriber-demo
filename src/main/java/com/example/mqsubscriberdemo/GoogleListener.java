package com.example.mqsubscriberdemo;

import static com.example.mqsubscriberdemo.TestChannel.GOOGLE_CHANNEL;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class GoogleListener {

	@StreamListener(GOOGLE_CHANNEL)
	public void getMessageForGoogle(Message<String> googleMessage) {
		log.info("Received Google message:{}", googleMessage.getPayload());
	}
}
