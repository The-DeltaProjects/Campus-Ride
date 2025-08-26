package za.ca.cput.factory;

import za.ca.cput.domain.Schedule;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.util.Helper;

import java.time.LocalDateTime;

public class ScheduleFactory {

    public static Schedule createSchedule(
            Long scheduleId,
            Shuttle shuttle,
            ShuttleOperator operator,
            String origin,
            String destination,
            LocalDateTime departureTime,
            LocalDateTime arrivalTime,
            int availableSeats
    ) {

        Helper.validateString(origin);
        Helper.validateString(destination);
        Helper.validateCapacity(availableSeats);

        if (departureTime == null || arrivalTime == null || departureTime.isAfter(arrivalTime)) {
            throw new IllegalArgumentException("Invalid departure or arrival time");
        }

        return new Schedule.Builder()
                .setShechduleId(scheduleId)
                .setShuttle(shuttle)
                .setOperator(operator)
                .setOrigin(origin)
                .setDestination(destination)
                .setDepartureTime(departureTime)
                .setArrivalTime(arrivalTime)
                .setAvailableSeats(availableSeats)
                .build();
    }
}
