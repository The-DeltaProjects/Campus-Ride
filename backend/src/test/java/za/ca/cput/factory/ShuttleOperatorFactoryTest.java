package za.ca.cput.factory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.domain.enums.ShuttleOperatorStatus;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ShuttleOperatorFactoryTest {

    @Test
        void testCreateShuttleOperator_Success() {
            Shuttle shuttle = new Shuttle.Builder()
                    .setShuttleId(1L)
                    .setCapacity(20)
                    .setLicensePlate("CA-12-3456")
                    .build();

            Notifications notification = new Notifications.Builder()
                    .setTitle("Welcome")
                    .setMessage("You have been assigned a shuttle.")
                    .build();

            ShuttleOperator operator = ShuttleOperatorFactory.createShuttleOperator(
                    1L,
                    LocalDateTime.now().minusDays(30),
                    shuttle,
                    ShuttleOperatorStatus.ACTIVE,
                    "All good",
                    100L,
                    "Luyanda",
                    "Mbalenhle",
                    "luh@gmail.com",
                    "securePassword123",
                    notification
            );

            assertNotNull(operator);
            assertEquals(ShuttleOperatorStatus.ACTIVE, operator.getStatus());
            assertEquals(shuttle, operator.getAssignedShuttle());
            assertEquals("All good", operator.getStatusReason());
        }

    @Test
    void testCreateShuttleOperator_InvalidEmail() {
        Shuttle shuttle = new Shuttle.Builder().build();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            ShuttleOperatorFactory.createShuttleOperator(
                    1L,
                    LocalDateTime.now().minusDays(10),
                    shuttle,
                    ShuttleOperatorStatus.ACTIVE,
                    null,
                    101L,
                    "Luyanda",
                    "Mbalenhle",
                    "invalid-email",
                    "password123",
                    null
            );
        });

        assertEquals("Invalid email format", exception.getMessage());
        System.out.println(exception.getMessage());
    }

}