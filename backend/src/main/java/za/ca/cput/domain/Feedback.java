package za.ca.cput.domain;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long feedbackId;

    private String comment;
    private LocalDateTime feedbackTime;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "shuttle_id")
    private Shuttle shuttle;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

    protected Feedback() {}

    private Feedback(Builder builder) {
        this.feedbackId = builder.feedbackId;
        this.comment = builder.comment;
        this.feedbackTime = builder.feedbackTime;
        this.student = builder.student;
        this.shuttle = builder.shuttle;
        this.booking = builder.booking;
    }

    // Getters
    public Long getFeedbackId() { return feedbackId; }
    public String getComment() { return comment; }
    public LocalDateTime getFeedbackTime() { return feedbackTime; }
    public Student getStudent() { return student; }
    public Shuttle getShuttle() { return shuttle; }
    public Booking getBooking() { return booking; }


    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", comment='" + comment + '\'' +
                ", feedbackTime=" + feedbackTime +
                ", student=" + (student != null ? student.getFirstName() + " " + student.getLastName() : "None") + // FIXED: student.getFirstName() instead of student.getUser().getFirstName()
                ", shuttle=" + (shuttle != null ? shuttle.getLicensePlate() : "None") +
                ", booking=" + (booking != null ? booking.getBookingId() : "None") +
                '}';
    }

    public static class Builder {
        private Long feedbackId;
        private String comment;
        private LocalDateTime feedbackTime;
        private Student student;
        private Shuttle shuttle;
        private Booking booking;

        public Builder setFeedbackId(Long feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = comment;
            return this;
        }

        public Builder setFeedbackTime(LocalDateTime feedbackTime) {
            this.feedbackTime = feedbackTime;
            return this;
        }

        public Builder setStudent(Student student) {
            this.student = student;
            return this;
        }

        public Builder setShuttle(Shuttle shuttle) {
            this.shuttle = shuttle;
            return this;
        }

        public Builder setBooking(Booking booking) {
            this.booking = booking;
            return this;
        }

        public Builder copy(Feedback feedback) {
            this.feedbackId = feedback.feedbackId;
            this.comment = feedback.comment;
            this.feedbackTime = feedback.feedbackTime;
            this.student = feedback.student;
            this.shuttle = feedback.shuttle;
            this.booking = feedback.booking;
            return this;
        }

        public Feedback build() {
            return new Feedback(this);
        }
    }
}