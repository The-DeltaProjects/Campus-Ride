package za.ca.cput.domain;

public abstract class User {
    protected Long userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected Notifications notifications;

    public Long getUserId() {
        return userId;
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

    public Notifications getNotifications() {
        return notifications;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", notifications=" + notifications +
                '}';
    }
}
