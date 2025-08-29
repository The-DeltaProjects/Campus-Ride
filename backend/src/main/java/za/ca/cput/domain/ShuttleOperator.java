package za.ca.cput.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "shuttle_operator")
public class ShuttleOperator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long operatorId;

    private String firstName;
    private String lastName;

    @Column(unique = true, nullable = false)
    private String email;
    private String password;
    private String licenseNumber;

    @ManyToOne
    @JoinColumn(name = "assigned_shuttle_id")
    private Shuttle assignedShuttle;

    public String getRole() {
        return "SHUTTLE_OPERATOR";
    }

    protected ShuttleOperator() {}

    private ShuttleOperator(Builder builder) {
        this.operatorId = builder.operatorId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.licenseNumber = builder.licenseNumber;
        this.assignedShuttle = builder.assignedShuttle;
    }

    public Long getOperatorId() {
        return operatorId;
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

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public Shuttle getAssignedShuttle() {
        return assignedShuttle;
    }

    public ShuttleOperator setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
        return this;
    }

    public ShuttleOperator setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ShuttleOperator setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ShuttleOperator setEmail(String email) {
        this.email = email;
        return this;
    }

    public ShuttleOperator setPassword(String password) {
        this.password = password;
        return this;
    }

    public ShuttleOperator setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }


    public ShuttleOperator setAssignedShuttle(Shuttle assignedShuttle) {
        this.assignedShuttle = assignedShuttle;
        return this;
    }

    @Override
    public String toString() {
        return "ShuttleOperator{" +
                "operatorId=" + operatorId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", licenseNumber='" + licenseNumber + '\'' +
                '}';
    }

    public static class Builder {
        private Long operatorId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private String licenseNumber;
        private Shuttle assignedShuttle;

        public Builder setOperatorId(Long operatorId) {
            this.operatorId = operatorId;
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

        public Builder setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }

        public Builder setAssignedShuttle(Shuttle assignedShuttle) {
            this.assignedShuttle = assignedShuttle;
            return this;
        }

        public Builder copy(ShuttleOperator shuttleOperator){
            return new Builder()
                    .setOperatorId(this.operatorId)
                    .setFirstName(this.firstName)
                    .setLastName(this.lastName)
                    .setEmail(this.email)
                    .setPassword(this.password)
                    .setLicenseNumber(this.licenseNumber)
                    .setAssignedShuttle(this.assignedShuttle);
        }

        public ShuttleOperator build() {
            return new ShuttleOperator(this);
        }

    }
}