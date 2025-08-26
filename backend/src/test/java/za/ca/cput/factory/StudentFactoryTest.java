package za.ca.cput.factory;

import net.minidev.json.JSONUtil;
import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Notifications;
import za.ca.cput.domain.Student;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentFactoryTest {

    @Test
    void createStudent() {

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(new Booking.Builder().build());

        List<Feedback> feedbackList = new ArrayList<>();
        feedbackList.add(new Feedback.Builder().build());

        Notifications notification = new Notifications.Builder()
                .setTitle("Welcome")
                .setMessage("You are registered!")
                .build();

        Student student = StudentFactory.createStudent(
                "222788291",
                bookingList,
                feedbackList,
                1L,
                "Luyanda",
                "Mbalenhle",
                "222788291@mycput.ac.za",
                "Password123",
                notification
        );

        assertNotNull(student);
        assertEquals("Luyanda", student.getFirstName());
        assertEquals("222788291@mycput.ac.za", student.getEmail());
        assertEquals(bookingList, student.getBookings());
        assertEquals(feedbackList, student.getFeedbackList());
        System.out.println(student);
    }
}