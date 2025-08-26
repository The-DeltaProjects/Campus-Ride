package za.ca.cput.factory;

import za.ca.cput.domain.Notifications;
import za.ca.cput.util.Helper;

import java.time.LocalDateTime;

public class NotificationsFactory {
    public static Notifications createNotification(
            Long notificationId,
            String title,
            String message,
            LocalDateTime sentTime,
            boolean isRead
    ) {
        // Validate mandatory fields
        Helper.validateString(title);
        Helper.validateString(message);

        if (sentTime == null) {
            sentTime = LocalDateTime.now();
        }

        return new Notifications.Builder()
                .setNotificationId(notificationId)
                .setTitle(title)
                .setMessage(message)
                .setSentTime(sentTime)
                .setRead(isRead)
                .build();
    }
}
