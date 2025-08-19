package za.ca.cput.domain;

import java.time.LocalDateTime;

public class Feedback {
    private Long feedbackId;
    private String comment;
    private LocalDateTime feedbackTime;
    private Student student;
    private Shuttle shuttle;
    private Booking booking;

    protected Feedback() {
    }

    private Feedback(Builder builder) {
        this.feedbackId = builder.feedbackId;
        this.comment = builder.comment;
        this.feedbackTime = builder.feedbackTime;
        this.student = builder.student;
        this.shuttle = builder.shuttle;
        this.booking = builder.booking;
    }

    public Long getFeedbackId() {
        return feedbackId;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getFeedbackTime() {
        return feedbackTime;
    }

    public Student getStudent() {
        return student;
    }

    public Shuttle getShuttle() {
        return shuttle;
    }

    public Booking getBooking() {
        return booking;
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "feedbackId=" + feedbackId +
                ", comment='" + comment + '\'' +
                ", feedbackTime=" + feedbackTime +
                ", student=" + student +
                ", shuttle=" + shuttle +
                ", booking=" + booking +
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

        public Builder copy(Builder builder){
            return new Builder()
                    .setFeedbackId(this.feedbackId)
                    .setComment(this.comment)
                    .setFeedbackTime(this.feedbackTime)
                    .setStudent(this.student)
                    .setShuttle(this.shuttle)
                    .setBooking(this.booking);
        }

        public Feedback build() {
            return new Feedback(this);
        }
    }
}
