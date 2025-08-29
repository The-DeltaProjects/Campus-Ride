package za.ca.cput.util.dto;

public class SignupDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;

    public String getFirstName() {
        return firstName;
    }

    public SignupDTO setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public SignupDTO setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public SignupDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public SignupDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public SignupDTO setRole(String role) {
        this.role = role;
        return this;
    }
}

