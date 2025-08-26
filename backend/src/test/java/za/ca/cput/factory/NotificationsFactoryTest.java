package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Notifications;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class NotificationsFactoryTest {

    @Test
    void createNotification() {
        Notifications notification = NotificationsFactory.createNotification(
                1L,
                "Welcome",
                "You are registered!",
                LocalDateTime.now(),
                false
        );

        assertNotNull(notification);
        assertEquals("Welcome", notification.getTitle());
        assertEquals("You are registered!", notification.getMessage());
        assertFalse(notification.isRead());

        System.out.println(notification);

    }
}