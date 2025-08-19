package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Booking {

    private Long bookingId;
    private LocalDateTime bookingTime;
    private String pickupLocation;
    private String dropoffLocation;
    private Shuttle shuttle;
    private Student bookedStudent;
    private Ticket ticket;
    private String bookingStatus;

    protected Booking() {
    }

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

    public Long getBookingId() {
        return bookingId;
    }

    public LocalDateTime getBookingTime() {
        return bookingTime;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public Student getBookedStudent() {
        return bookedStudent;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingTime=" + bookingTime +
                ", pickupLocation='" + pickupLocation + '\'' +
                ", dropoffLocation='" + dropoffLocation + '\'' +
                ", shuttle=" + shuttle +
                ", bookedStudent=" + bookedStudent +
                ", ticket=" + ticket +
                ", bookingStatus='" + bookingStatus + '\'' +
                '}';
    }

    public static class Builder {
        private Long bookingId;
        private LocalDateTime bookingTime;
        private String pickupLocation;
        private String dropoffLocation;
        private Shuttle shuttle;
        private Student bookedStudent;
        private Ticket ticket;
        private String bookingStatus;

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

        public Builder setBookingStatus(String bookingStatus) {
            this.bookingStatus = bookingStatus;
            return this;
        }

        public Builder copy(Builder builder){
            return new Builder()
                    .setBookingId(this.bookingId)
                    .setBookingTime(this.bookingTime)
                    .setPickupLocation(this.pickupLocation)
                    .setDropoffLocation(this.dropoffLocation)
                    .setShuttle(this.shuttle)
                    .setBookedStudent(this.bookedStudent)
                    .setTicket(this.ticket)
                    .setBookingStatus(this.bookingStatus);
        }

        public Booking build() {
            return new Booking(this);
        }
    }
}
