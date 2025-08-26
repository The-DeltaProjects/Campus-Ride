package za.ca.cput.factory;

import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Ticket;

import java.time.LocalDateTime;

public class TicketFactory {
    public static Ticket createTicket(
            Long ticketId,
            LocalDateTime issuedDate,
            boolean isVerified,
            Booking booking
    ) {
        if (ticketId == null || ticketId <= 0) {
            throw new IllegalArgumentException("Invalid ticket ID");
        }


        if (issuedDate == null || issuedDate.isAfter(LocalDateTime.now().plusYears(1))) {
            throw new IllegalArgumentException("Invalid issued date");
        }
        if (booking == null) {
            throw new IllegalArgumentException("Booking cannot be null");
        }


        return new Ticket.Builder()
                .setTicketId(ticketId)
                .setIssuedDate(issuedDate)
                .setVerified(isVerified)
                .setBooking(booking)
                .build();
    }
}
