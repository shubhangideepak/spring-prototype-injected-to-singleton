package com.shubhangi.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;

import com.shubhangi.notification.beans.Notifications;
import com.shubhangi.notifications.setter.NotificationManager;
import com.shubhangi.spring.config.SpringConfig;

public class FetchNotifications {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        NotificationManager notificationManager1 = context.getBean(NotificationManager.class);
        NotificationManager notificationManager2 = context.getBean(NotificationManager.class);

        System.out.println("NotificationManager 1: " + notificationManager1);
        System.out.println("NotificationManager 2: " + notificationManager2);

        Notifications notifications1 = context.getBean(Notifications.class);
        Notifications notifications2 = context.getBean(Notifications.class);


        System.out.println("Notifications 1: " + notifications1);
        System.out.println("Notifications 2: " + notifications2);

        notificationManager1.processNotification("Hello world", "Shubhangi");
        notificationManager1.processNotification("How are you", "Shubhangi");

        System.out.println("notificationManager1 == notificationManager2: " + (notificationManager1 == notificationManager2));  // true
        System.out.println("notifications1 == notifications2: " + (notifications1 == notifications2));  // false
    }
}
