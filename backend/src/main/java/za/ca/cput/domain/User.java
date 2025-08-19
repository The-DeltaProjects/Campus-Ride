package za.ca.cput.domain;

public abstract class User {
    protected Long userId;
    protected String firstName;
    protected String lastName;
    protected String email;
    protected String password;
    protected Notifications notifications;

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
