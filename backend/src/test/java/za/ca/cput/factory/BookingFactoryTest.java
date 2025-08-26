package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.Student;
import za.ca.cput.domain.Ticket;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BookingFactoryTest {

    @Test
    void createBooking() {
        Shuttle shuttle1 = new Shuttle.Builder()
                .setShuttleId(1L)
                .setCapacity(20)
                .setLicensePlate("CA-12-3456")
                .build();

        Student student = new Student.Builder().setStudentNumber("222788291").setFirstName("Luyanda").setLastName("Makhanya").build();
        Ticket ticket = new Ticket.Builder().setTicketId(1L).build();

        Booking booking = BookingFactory.createBooking(
                1L,
                LocalDateTime.now(),
                "Cape Towm Campus",
                "Bellville Campus",
                shuttle1,
                student,
                ticket,
                "CONFIRMED"
        );

        assertNotNull(booking);
        assertEquals("Cape Towm Campus", booking.getPickupLocation());
        assertEquals("CONFIRMED", booking.getBookingStatus());
        assertEquals(student, booking.getBookedStudent());
        System.out.println(booking);
    }
}