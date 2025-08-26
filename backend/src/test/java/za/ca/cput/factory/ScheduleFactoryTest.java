package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Schedule;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ScheduleFactoryTest {

    @Test
    void createSchedule() {
        // Sample shuttle and operator (mock objects or simple instances)
        Shuttle shuttle = new Shuttle.Builder()
                .setShuttleId(1L)
                .setCapacity(50)
                .build();

        ShuttleOperator operator = new ShuttleOperator.Builder()
                .setOperatorId(101L)
                .setFirstName("Bethu")
                .setLastName("Ngxitho")
                .build();

        LocalDateTime departure = LocalDateTime.of(2025, 8, 26, 8, 0);
        LocalDateTime arrival = LocalDateTime.of(2025, 8, 26, 9, 0);

        Schedule schedule = ScheduleFactory.createSchedule(
                1L,
                shuttle,
                operator,
                "Cape Town Campus",
                "Newlands Campus",
                departure,
                arrival,
                50
        );


        assertNotNull(schedule);
        assertEquals("Cape Town Campus", schedule.getOrigin());
        assertEquals("Newlands Campus", schedule.getDestination());
        assertEquals(departure, schedule.getDepartureTime());
        assertEquals(arrival, schedule.getArrivalTime());
        assertEquals(50, schedule.getAvailableSeats());
        assertEquals(shuttle, schedule.getShuttle());
        assertEquals(operator, schedule.getOperator());

        System.out.println(schedule);
    }
}