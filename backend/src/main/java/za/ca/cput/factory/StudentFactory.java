package za.ca.cput.factory;

import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Student;
import za.ca.cput.util.Helper;

import java.util.List;

public class StudentFactory {
    public static Student createStudent(
            String studentNumber,
            List<Booking> bookings,
            List<Feedback> feedbackList,
            Long userId,
            String firstName,
            String lastName,
            String email,
            String password,
            Notifications notifications
    )
    {
        // Validate mandatory fields
        Helper.validateString(firstName);
        Helper.validateString(lastName);
        Helper.validateString(email);
        Helper.validateString(password);
        Helper.validateString(studentNumber);
        Helper.isValidStudentNumber(studentNumber);

        if (!Helper.isValidEmail(email)) {
            throw new IllegalArgumentException("Invalid email format");
        }

        if (!Helper.isValidStudentNumber(studentNumber)) {
            throw new IllegalArgumentException("Invalid student number format");
        }
        return new Student.Builder()
                .setStudentNumber(studentNumber)
                .setBookings(bookings)
                .setFeedbackList(feedbackList)
                .setUserId(userId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setNotifications(notifications)
                .build();
    }
    }
