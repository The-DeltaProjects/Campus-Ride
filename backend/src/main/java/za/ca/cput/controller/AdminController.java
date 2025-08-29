package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.Admin;
import za.ca.cput.service.AdminService;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService adminService;
//
//    @PostMapping("/signup")
//    public ResponseEntity<String> signup(@RequestBody SignupDTO dto) {
//        return adminService.signup(dto);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody SignupDTO dto) {
//        boolean valid = adminService.validateCredentials(dto.getEmail(), dto.getPassword());
//        if (valid) {
//            return ResponseEntity.ok("Login successful");
//        } else {
//            return ResponseEntity.status(401).body("Invalid email or password");
//        }
//    }

    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAll();
    }


    @GetMapping("/{id}")
    public Admin getAdmin(@PathVariable Long id) {
        return adminService.read(id);
    }


    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable Long id, @RequestBody Admin admin) {
        admin.setAdminId(id);
        return adminService.update(admin);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAdmin(@PathVariable Long id) {
        boolean deleted = adminService.delete(id);
        if (deleted) {
            return ResponseEntity.ok("Admin deleted successfully");
        } else {
            return ResponseEntity.status(404).body("Admin not found");
        }
    }
}

