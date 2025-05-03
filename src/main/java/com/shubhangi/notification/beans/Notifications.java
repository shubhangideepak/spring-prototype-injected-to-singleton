package com.shubhangi.notification.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Notifications {
private String messages;
private String recipient;

public String getMessages() {
	return messages;
}

public void setMessages(String messages) {
	this.messages = messages;
}

public String getRecipient() {
	return recipient;
}

public void setRecipient(String recipient) {
	this.recipient = recipient;
}

public void sendNotification() {
	System.out.println("Sending message " + messages + " to recipient " + recipient);
}
}
