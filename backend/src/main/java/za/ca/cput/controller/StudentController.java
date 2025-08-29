package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ca.cput.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


//    @PostMapping("/signup")
//    public ResponseEntity<String> signup(@RequestBody SignupDTO dto) {
//        return studentService.signup(dto);
//    }
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestBody SignupDTO dto) {
//        boolean valid = studentService.validateCredentials(dto.getEmail(), dto.getPassword());
//        if (valid) {
//            return ResponseEntity.ok("Login successful");
//        }
//        return ResponseEntity.badRequest().body("Invalid email or password");
//    }

}
