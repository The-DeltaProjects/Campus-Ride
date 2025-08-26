package za.ca.cput.factory;

import za.ca.cput.domain.Booking;
import za.ca.cput.domain.Shuttle;
import za.ca.cput.domain.Student;
import za.ca.cput.domain.Ticket;

import java.time.LocalDateTime;

public class BookingFactory {
    public static Booking createBooking(
            Long bookingId,
            LocalDateTime bookingTime,
            String pickupLocation,
            String dropoffLocation,
            Shuttle shuttle,
            Student bookedStudent,
            Ticket ticket,
            String bookingStatus
    ){
        // Basic validation
        if (bookingId == null || bookingId <= 0) {
            throw new IllegalArgumentException("Invalid booking ID");
        }
        if (bookingTime == null || bookingTime.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("Invalid booking time");
        }

        if (pickupLocation == null || pickupLocation.isEmpty()) {
            throw new IllegalArgumentException("Pickup location cannot be null or empty");
        }
        if (dropoffLocation == null || dropoffLocation.isEmpty()) {
            throw new IllegalArgumentException("Dropoff location cannot be null or empty");
        }
        if (shuttle == null) {
            throw new IllegalArgumentException("Shuttle cannot be null");
        }
        if (bookedStudent == null) {
            throw new IllegalArgumentException("Booked student cannot be null");
        }
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket cannot be null");
        }
        if (bookingStatus == null || bookingStatus.isEmpty()) {
            throw new IllegalArgumentException("Booking status cannot be null or empty");
        }

        return new Booking.Builder()
                .setBookingId(bookingId)
                .setBookingTime(bookingTime)
                .setPickupLocation(pickupLocation)
                .setDropoffLocation(dropoffLocation)
                .setShuttle(shuttle)
                .setBookedStudent(bookedStudent)
                .setTicket(ticket)
                .setBookingStatus(bookingStatus)
                .build();
    }
}
