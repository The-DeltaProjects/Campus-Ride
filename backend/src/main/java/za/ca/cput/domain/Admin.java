package za.ca.cput.domain;

public class Admin extends User{
    private Long adminId;
    private Schedule managedSchedule;

    protected Admin() {

    }

    private Admin(Builder builder) {
        this.adminId = builder.adminId;
        this.managedSchedule = builder.managedSchedule;
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.notifications = builder.notifications;
    }

    public Long getAdminId() {
        return adminId;
    }

    public Schedule getManagedSchedule() {
        return managedSchedule;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", managedSchedule=" + managedSchedule +
                ", userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notifications=" + notifications +
                '}';
    }

    public static class Builder {
        private Long adminId;
        private Schedule managedSchedule;
        private Long userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;
        private Notifications notifications;

        public Builder adminId(Long adminId) {
            this.adminId = adminId;
            return this;
        }

        public Builder managedSchedule(Schedule managedSchedule) {
            this.managedSchedule = managedSchedule;
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
            this.adminId = builder.adminId;
            this.managedSchedule = builder.managedSchedule;
            this.userId = builder.userId;
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.email = builder.email;
            this.password = builder.password;
            this.notifications = builder.notifications;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }

    }
}




