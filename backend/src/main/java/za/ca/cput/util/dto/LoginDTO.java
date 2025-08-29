package za.ca.cput.util.dto;

public class LoginDTO {
    private String email;
    private String password;
    private String role;

    public String getEmail() {
        return email;
    }

    public LoginDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginDTO setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getRole() {
        return role;
    }

    public LoginDTO setRole(String role) {
        this.role = role;
        return this;
    }
}
