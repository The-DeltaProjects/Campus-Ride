package za.ca.cput.domain;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentNumber;
    private List<Booking> bookings;
    private List<Feedback> feedbackList;


    protected Student() {
        this.bookings = new ArrayList<>();
        this.feedbackList = new ArrayList<>();
    }

    private Student(Builder builder) {
        this.studentNumber = builder.studentNumber;
        this.bookings = builder.bookings != null ? builder.bookings : new ArrayList<>();
        this.feedbackList = builder.feedbackList != null ? builder.feedbackList : new ArrayList<>();
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.notifications = builder.notifications;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }


    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", numberOfBookings=" + (bookings != null ? bookings.size() : 0) +
                ", feedbackList=" + (feedbackList != null ? feedbackList.size() : 0) +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notifications=" + notifications +
                '}';
    }

    public static class Builder {
        private String studentNumber;
        private List<Booking> bookings;
        private List<Feedback> feedbackList;
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Notifications notifications;

        public Builder setStudentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder setBookings(List<Booking> bookings) {
            this.bookings = bookings;
            return this;
        }

        public Builder setFeedbackList(List<Feedback> feedbackList) {
            this.feedbackList = feedbackList;
            return this;
        }

        public Builder setUserId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setNotifications(Notifications notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder copy(Builder builder) {
            this.studentNumber = builder.studentNumber;
            this.bookings = builder.bookings;
            this.feedbackList = builder.feedbackList;
            this.userId = builder.userId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.password = builder.password;
            this.notifications = builder.notifications;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
