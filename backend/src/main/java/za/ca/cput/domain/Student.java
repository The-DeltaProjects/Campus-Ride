package za.ca.cput.domain;

public class Student extends User{
    private String studentNumber;
    private Booking bookings;
    private Feedback feedback;

    protected Student() {
    }

    private Student(Builder builder) {
        this.studentNumber = builder.studentNumber;
        this.bookings = builder.bookings;
        this.feedback = builder.feedback;
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

    public Booking getBookings() {
        return bookings;
    }
    public Feedback getFeedback() {
        return feedback;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentNumber='" + studentNumber + '\'' +
                ", bookings=" + bookings +
                ", feedback=" + feedback +
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
        private Booking bookings;
        private Feedback feedback;
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Notifications notifications;

        public Builder studentNumber(String studentNumber) {
            this.studentNumber = studentNumber;
            return this;
        }

        public Builder bookings(Booking bookings) {
            this.bookings = bookings;
            return this;
        }

        public Builder feedback(Feedback feedback) {
            this.feedback = feedback;
            return this;
        }

        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public Builder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder notifications(Notifications notifications) {
            this.notifications = notifications;
            return this;
        }

        public Builder copy(Builder builder){
            this.studentNumber = builder.studentNumber;
            this.bookings = builder.bookings;
            this.feedback = builder.feedback;
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
