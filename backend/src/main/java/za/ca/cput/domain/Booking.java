package za.ca.cput.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    private LocalDateTime bookingTime;
    private String pickupLocation;
    private String dropoffLocation;
    private String bookingStatus;

    @ManyToOne
    @JoinColumn(name = "shuttle_id")
    private Shuttle shuttle;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student bookedStudent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

    protected Booking() {}

    private Booking(Builder builder) {
        this.bookingId = builder.bookingId;
        this.bookingTime = builder.bookingTime;
        this.pickupLocation = builder.pickupLocation;
        this.dropoffLocation = builder.dropoffLocation;
        this.shuttle = builder.shuttle;
        this.bookedStudent = builder.bookedStudent;
        this.ticket = builder.ticket;
        this.bookingStatus = builder.bookingStatus;
    }

    // Getters
    public Long getBookingId() { return bookingId; }
    public LocalDateTime getBookingTime() { return bookingTime; }
    public String getPickupLocation() { return pickupLocation; }
    public String getDropoffLocation() { return dropoffLocation; }
    public String getBookingStatus() { return bookingStatus; }
    public Shuttle getShuttle() { return shuttle; }
    public Student getBookedStudent() { return bookedStudent; }
    public Ticket getTicket() { return ticket; }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingTime=" + bookingTime +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropoffLocation='" + dropoffLocation + '\'' +
                ", shuttle=" + (shuttle != null ? shuttle.getLicensePlate() : "None") +
                ", bookedStudent=" + (bookedStudent != null ? bookedStudent.getFirstName() + " " + bookedStudent.getLastName() : "None") + // FIXED: bookedStudent.getFirstName() instead of bookedStudent.getUser().getFirstName()
                ", ticket=" + (ticket != null ? ticket.getTicketId() : "None") +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }

    public static class Builder {
        private Long bookingId;
        private LocalDateTime bookingTime;
        private String pickupLocation;
        private String dropoffLocation;
        private String bookingStatus;
        private Shuttle shuttle;
        private Student bookedStudent;
        private Ticket ticket;

        public Builder setBookingId(Long bookingId) {
            this.bookingId = bookingId;
            return this;
        }

        public Builder setBookingTime(LocalDateTime bookingTime) {
            this.bookingTime = bookingTime;
            return this;
        }

        public Builder setPickupLocation(String pickupLocation) {
            this.pickupLocation = pickupLocation;
            return this;
        }

        public Builder setDropoffLocation(String dropoffLocation) {
            this.dropoffLocation = dropoffLocation;
            return this;
        }

        public Builder setBookingStatus(String bookingStatus) {
            this.bookingStatus = bookingStatus;
            return this;
        }

        public Builder setShuttle(Shuttle shuttle) {
            this.shuttle = shuttle;
            return this;
        }

        public Builder setBookedStudent(Student bookedStudent) {
            this.bookedStudent = bookedStudent;
            return this;
        }

        public Builder setTicket(Ticket ticket) {
            this.ticket = ticket;
            return this;
        }

        public Builder copy(Booking booking) {
            this.bookingId = booking.bookingId;
            this.bookingTime = booking.bookingTime;
            this.pickupLocation = booking.pickupLocation;
            this.dropoffLocation = booking.dropoffLocation;
            this.shuttle = booking.shuttle;
            this.bookedStudent = booking.bookedStudent;
            this.ticket = booking.ticket;
            this.bookingStatus = booking.bookingStatus;
            return this;
        }

        public Booking build() {
            return new Booking(this);
        }
    }

}
