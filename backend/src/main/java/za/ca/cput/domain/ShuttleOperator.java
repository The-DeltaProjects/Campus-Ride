package za.ca.cput.domain;

import java.time.LocalDateTime;

public class ShuttleOperator extends User{
    private Long operatorId;
    private LocalDateTime hireDate;
    private Shuttle assignedShuttle;
    private ShuttleOperatorStatus status;
    private String statusReason;

    protected ShuttleOperator() {

    }

    private ShuttleOperator(Builder builder) {
        this.operatorId = builder.operatorId;
        this.hireDate = builder.hireDate;
        this.assignedShuttle = builder.assignedShuttle;
        this.status = builder.status;
        this.statusReason = builder.statusReason;
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.notifications = builder.notifications;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public LocalDateTime getHireDate() {
        return hireDate;
    }

    public Shuttle getAssignedShuttle() {
        return assignedShuttle;
    }

    public ShuttleOperatorStatus getStatus() {
        return status;
    }

    public String getStatusReason() {
        return statusReason;
    }

    @Override
    public String toString() {
        return "ShuttleOperator{" +
                "operatorId=" + operatorId +
                ", hireDate=" + hireDate +
                ", assignedShuttle=" + assignedShuttle +
                ", status=" + status +
                ", statusReason='" + statusReason + '\'' +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notifications=" + notifications +
                '}';
    }

    public static class Builder {
        private Long operatorId;
        private LocalDateTime hireDate;
        private Shuttle assignedShuttle;
        private ShuttleOperatorStatus status;
        private String statusReason;
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Notifications notifications;


        public Builder setOperatorId(Long operatorId) {
            this.operatorId = operatorId;
            return this;
        }

        public Builder setHireDate(LocalDateTime hireDate) {
            this.hireDate = hireDate;
            return this;
        }

        public Builder setAssignedShuttle(Shuttle assignedShuttle) {
            this.assignedShuttle = assignedShuttle;
            return this;
        }

        public Builder setStatus(ShuttleOperatorStatus status) {
            this.status = status;
            return this;
        }

        public Builder setStatusReason(String statusReason) {
            this.statusReason = statusReason;
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



        public Builder copy(Builder builder){
            this.operatorId = builder.operatorId;
            this.hireDate = builder.hireDate;
            this.assignedShuttle = builder.assignedShuttle;
            this.status = builder.status;
            this.statusReason = builder.statusReason;
            this.userId = builder.userId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.password = builder.password;
            this.notifications = builder.notifications;
            return this;
        }

        public ShuttleOperator build() {
            return new ShuttleOperator(this);
        }
    }
}

