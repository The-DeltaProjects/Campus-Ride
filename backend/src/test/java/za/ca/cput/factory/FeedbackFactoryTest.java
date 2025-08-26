package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Feedback;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.Student;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class FeedbackFactoryTest {

    @Test
    void createFeedback() {
        Student student = new Student.Builder()
                .setUserId(102L)
                .setFirstName("Luyanda")
                .setLastName("Makhanya")
                .setEmail("222788291@mycput.ac.za")
                .setPassword("Password123")
                .build();

        Shuttle shuttle = new Shuttle.Builder()
                .setShuttleId(1099L)
                .setCapacity(30)
                .setLicensePlate("CA-1234")
                .build();

        // Sample booking
        Booking booking = new Booking.Builder()
                .setBookingId(900L)
                .setBookingTime(LocalDateTime.now().minusDays(1))
                .setPickupLocation("Campus")
                .setDropoffLocation("Library")
                .setShuttle(shuttle)
                .setBookedStudent(student)
                .setBookingStatus("CONFIRMED")
                .build();

        // Create feedback using factory
        Feedback feedback = FeedbackFactory.createFeedback(
                1L,
                "Shuttle was clean and on time",
                LocalDateTime.now().minusHours(2),
                student,
                shuttle,
                booking
        );

        assertNotNull(feedback);
        assertEquals("Shuttle was clean and on time", feedback.getComment());
        assertEquals(student, feedback.getStudent());
        assertEquals(shuttle, feedback.getShuttle());
        assertEquals(booking, feedback.getBooking());


        System.out.println(feedback);
    }
    }
