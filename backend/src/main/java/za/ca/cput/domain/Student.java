package za.ca.cput.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentNumber;

    private String firstName;
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private String password;

    public String getRole() {
        return "STUDENT";
    }

    protected Student() {
    }

    private Student(Builder builder) {
        this.studentNumber = builder.studentNumber;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public Long getStudentId() {
        return studentNumber;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }



    public static class Builder {
        private Long studentNumber;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Notifications notifications;

        public Builder setStudentId(Long studentNumber) {
            this.studentNumber = studentNumber;
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

        public Builder copy(Student student) {
            this.firstName = student.firstName;
            this.lastName = student.lastName;
            this.email = student.email;
            this.password = student.password;
            this.studentNumber = student.studentNumber;// Consider defensive copy if Notifications can change
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}