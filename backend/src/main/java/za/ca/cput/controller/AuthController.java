package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ca.cput.service.AdminService;
import za.ca.cput.service.ShuttleOperatorService;
import za.ca.cput.service.StudentService;
import za.ca.cput.util.dto.LoginDTO;
import za.ca.cput.util.dto.SignupDTO;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AdminService adminService;

    @Autowired
    private StudentService studentService;

    @Autowired
    private ShuttleOperatorService shuttleOperatorService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody SignupDTO dto) {

        if (dto.getRole() == null || dto.getRole().isBlank()) {
            return ResponseEntity.badRequest().body("Role is required");
        }
        String role = dto.getRole().toLowerCase();
        switch (role) {
            case "admin":
                return adminService.signup(dto);
            case "student":
                return studentService.signup(dto);
            case "driver":
                return shuttleOperatorService.signup(dto);
            default:
                return ResponseEntity.badRequest().body("Invalid role");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO dto) {
        String role = dto.getRole().toLowerCase();
        boolean valid = false;

        switch (role) {
            case "admin":
                valid = adminService.validateCredentials(dto.getEmail(), dto.getPassword());
                break;
            case "student":
                valid = studentService.validateCredentials(dto.getEmail(), dto.getPassword());
                break;
            case "driver":
                valid = shuttleOperatorService.validateCredentials(dto.getEmail(), dto.getPassword());
                break;
        }

        return valid ? ResponseEntity.ok("Login successful") : ResponseEntity.status(401).body("Invalid credentials");
    }
}

