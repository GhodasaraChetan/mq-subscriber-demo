package com.example.mqsubscriberdemo;

import static com.example.mqsubscriberdemo.TestChannel.MICROSOFT_CHANNEL;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MicrosoftListener {

	@StreamListener(MICROSOFT_CHANNEL)
	public void getMessageForMicrosoft(Message<String> microsoftMessage){
		log.info("Received Microsoft message:{}",microsoftMessage.getPayload());
	}
}
