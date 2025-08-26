package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.domain.enums.ShuttleStatus;

import static org.junit.jupiter.api.Assertions.*;

class ShuttleFactoryTest {

    @Test
    void createShuttle() {
        ShuttleOperator operator = new ShuttleOperator.Builder()
                .setFirstName("Abethu")
                .setLastName("Ngxitho")
                .build();

        Shuttle shuttle = ShuttleFactory.createShuttle(
                1L,
                20,
                operator,
                "CA123-456",
                ShuttleStatus.AVAILABLE
        );

        assertNotNull(shuttle);
        assertEquals(20, shuttle.getCapacity());
        assertEquals(operator, shuttle.getShuttleOperator());
        assertEquals("CA123-456", shuttle.getLicensePlate());
        assertEquals(ShuttleStatus.AVAILABLE, shuttle.getShuttleStatus());

        System.out.println(shuttle);
    }
}