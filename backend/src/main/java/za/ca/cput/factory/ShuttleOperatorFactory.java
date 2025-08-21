package za.ca.cput.factory;

import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.domain.enums.ShuttleOperatorStatus;
import za.ca.cput.util.Helper;

import java.time.LocalDateTime;

public class ShuttleOperatorFactory {
        public static ShuttleOperator createShuttleOperator(
                Long operatorId,
                LocalDateTime hireDate,
                Shuttle assignedShuttle,
                ShuttleOperatorStatus status,
                String statusReason,
                Long userId,
                String firstName,
                String lastName,
                String email,
                String password,
                Notifications notifications
    ) {
            // Validate mandatory fields
            Helper.validateString(firstName);
            Helper.validateString(lastName);
            Helper.validateString(email);
            Helper.validateString(password);

            if (!Helper.isValidEmail(email)) {
                throw new IllegalArgumentException("Invalid email format");
            }

            if (hireDate == null || hireDate.isAfter(LocalDateTime.now())) {
                throw new IllegalArgumentException("Hire date cannot be in the future or null");
            }

            return new ShuttleOperator.Builder()
                    .setOperatorId(operatorId)
                    .setHireDate(hireDate)
                    .setAssignedShuttle(assignedShuttle)
                    .setStatus(status)
                    .setStatusReason(statusReason)
                    .setUserId(userId)
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setPassword(password)
                    .setNotifications(notifications)
                    .build();
        }
    }

