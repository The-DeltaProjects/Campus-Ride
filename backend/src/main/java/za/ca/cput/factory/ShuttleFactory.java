package za.ca.cput.factory;

import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.domain.enums.ShuttleStatus;
import za.ca.cput.util.Helper;

public class ShuttleFactory {
    public static Shuttle createShuttle(
            Long shuttleId,
            int capacity,
            ShuttleOperator shuttleOperator,
            String licensePlate,
            ShuttleStatus shuttleStatus
    ) {
        // Validate mandatory fields
        Helper.validateCapacity(capacity);
        Helper.validateString(licensePlate);

        if (shuttleOperator == null) {
            throw new IllegalArgumentException("Shuttle operator cannot be null");
        }

        if (shuttleStatus == null) {
            throw new IllegalArgumentException("Shuttle status cannot be null");
        }

        return new Shuttle.Builder()
                .setShuttleId(shuttleId)
                .setCapacity(capacity)
                .setShuttleOperator(shuttleOperator)
                .setLicensePlate(licensePlate)
                .setShuttleStatus(shuttleStatus)
                .build();
    }
}
