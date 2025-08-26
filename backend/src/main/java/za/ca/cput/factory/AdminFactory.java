package za.ca.cput.factory;

import za.ca.cput.domain.Admin;
import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Schedule;
import za.ca.cput.util.Helper;

public class AdminFactory {
    public static Admin createAdmin(
            Long adminId,
            Schedule managedSchedule,
            Long userId,
            String firstName,
            String lastName,
            String email,
            String password,
            Notifications notifications
    ) {
        Helper.validateString(firstName);
        Helper.validateString(lastName);
        Helper.validateString(email);
        Helper.validateString(password);

        if (!Helper.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        // Build and return Admin object
        return new Admin.Builder()
                .adminId(adminId)
                .managedSchedule(managedSchedule)
                .userId(userId)
                .firstName(firstName)
                .lastName(lastName)
                .email(email)
                .password(password)
                .notifications(notifications)
                .build();
    }
}
