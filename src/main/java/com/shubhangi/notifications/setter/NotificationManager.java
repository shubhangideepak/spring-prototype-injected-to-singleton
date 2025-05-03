package com.shubhangi.notifications.setter;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.shubhangi.notification.beans.Notifications;
@Component
@Scope("singleton")
public class NotificationManager {
    public void processNotification(String message, String recipient) {
        Notifications notification = getNotification();
        notification.setMessages(message);
        notification.setRecipient(recipient);
        notification.sendNotification();
    }

    @Lookup
    public Notifications getNotification() {
    	System.out.println("Fetching new Notification instance...");
        return null;
    }
}
