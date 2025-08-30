package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.service.AdminService;
import za.ca.cput.service.ShuttleOperatorService;
import za.ca.cput.service.StudentService;
import za.ca.cput.util.dto.LoginDTO;
import za.ca.cput.util.dto.SignupDTO;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:5173/")
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
    public ResponseEntity<Map<String, Object>> login(@RequestBody LoginDTO dto) {
        String role = dto.getRole().toLowerCase();
        boolean valid = false;
        String errorMessage = "";

        try {
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
                default:
                    errorMessage = "Invalid role specified";
            }
        } catch (Exception e) {
            errorMessage = "Server error during authentication: " + e.getMessage();
            // Log the exception for debugging
            System.err.println("Login error: " + e.getMessage());
            e.printStackTrace();
        }

        Map<String, Object> response = new HashMap<>();
        if (valid) {
            response.put("message", "Login successful");
            response.put("role", role);
            response.put("success", true);
            return ResponseEntity.ok(response);
        } else {
            if (errorMessage.isEmpty()) {
                errorMessage = "Invalid credentials";
            }
            response.put("message", errorMessage);
            response.put("success", false);
            return ResponseEntity.status(401).body(response);
        }
    }

}

