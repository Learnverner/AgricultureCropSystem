package com.tell.config.receiver;

import org.springframework.stereotype.Component;

@Component
public class JMSReceiver {
public void receiveMessage(Product product) {
	System.out.println("Received<"+product+">");
}
}
