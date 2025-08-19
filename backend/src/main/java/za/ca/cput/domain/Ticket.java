package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Ticket {
    private Long ticketId;
    private LocalDateTime issuedDate;
    private boolean isVerified;
    private Booking booking;

    protected Ticket() {

    }
    private Ticket(Builder builder) {
        this.ticketId = builder.ticketId;
        this.issuedDate = builder.issuedDate;
        this.isVerified = builder.isVerified;
        this.booking = builder.booking;
    }

    public Long getTicketId() {
        return ticketId;
    }

    public LocalDateTime getIssuedDate() {
        return issuedDate;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketId=" + ticketId +
                ", issuedDate=" + issuedDate +
                ", isVerified=" + isVerified +
                ", booking=" + booking +
                '}';
    }

    public static class Builder {
        private Long ticketId;
        private LocalDateTime issuedDate;
        private boolean isVerified;
        private Booking booking;

        public Builder setTicketId(Long ticketId) {
            this.ticketId = ticketId;
            return this;
        }

        public Builder setIssuedDate(LocalDateTime issuedDate) {
            this.issuedDate = issuedDate;
            return this;
        }

        public Builder setVerified(boolean verified) {
            isVerified = verified;
            return this;
        }

        public Builder setBooking(Booking booking) {
            this.booking = booking;
            return this;
        }

        public Builder copy(Ticket ticket) {
            this.ticketId = ticket.ticketId;
            this.issuedDate = ticket.issuedDate;
            this.isVerified = ticket.isVerified;
            this.booking = ticket.booking;
            return this;
        }

        public Ticket build() {
            return new Ticket(this);
        }
    }
}
