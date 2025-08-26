package za.ca.cput.factory;

import org.junit.jupiter.api.Test;
import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Ticket;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class TicketFactoryTest {

    @Test
    void createTicket() {
        Booking booking = new Booking.Builder().build();

        Ticket ticket = TicketFactory.createTicket(
                1L,
                LocalDateTime.now(),
                false,
                booking
        );

        assertNotNull(ticket);
        assertEquals(1L, ticket.getTicketId());
        assertEquals(false, ticket.isVerified());
        assertEquals(booking, ticket.getBooking());

        System.out.println(ticket);
    }

}