package za.ca.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Admin;
import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Schedule;

import static org.junit.jupiter.api.Assertions.*;

class AdminFactoryTest {

    @Test
    void testCreateAdmin_Success() {
        Schedule schedule = new Schedule.Builder()
                .setShechduleId(1L)
                .build();

        Notifications notification = new Notifications.Builder()
                .setTitle("System Alert")
                .setMessage("You have a new schedule.")
                .build();

        Admin admin = AdminFactory.createAdmin(
                1L,
                schedule,
                100L,
                "Luyanda",
                "Mbalenhle",
                "luyanda@gmail.com",
                "Password123",
                notification
        );

        assertNotNull(admin);
        assertEquals("Luyanda", admin.getFirstName());
        assertEquals(schedule, admin.getManagedSchedule());
        assertEquals("luyanda@gmail.com", admin.getEmail());
        System.out.println(admin);
    }


}