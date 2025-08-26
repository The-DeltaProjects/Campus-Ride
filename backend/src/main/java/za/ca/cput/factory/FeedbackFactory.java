package za.ca.cput.factory;

import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.Student;
import za.ca.cput.util.Helper;

import java.time.LocalDateTime;

public class FeedbackFactory {
    public static Feedback createFeedback(
            Long feedbackId,
            String comment,
            LocalDateTime feedbackTime,
            Student student,
            Shuttle shuttle,
            Booking booking
    ){
        Helper.validateString(comment);

        if (feedbackTime == null || feedbackTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Feedback time cannot be null or in the future");
        }

        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }

        if (shuttle == null) {
            throw new IllegalArgumentException("Shuttle cannot be null");
        }

        if (booking == null) {
            throw new IllegalArgumentException("Booking cannot be null");
        }

        return new Feedback.Builder()
                .setFeedbackId(feedbackId)
                .setComment(comment)
                .setFeedbackTime(feedbackTime)
                .setStudent(student)
                .setShuttle(shuttle)
                .setBooking(booking)
                .build();
    }
    }


