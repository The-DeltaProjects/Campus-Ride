package za.ca.cput.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.ShuttleOperator;
import za.ca.cput.service.ShuttleOperatorService;

import java.util.List;

@RestController
@RequestMapping("/shuttle_operator")
public class ShuttleOperatorController {
    @Autowired
    private ShuttleOperatorService shuttleOperatorService;

//    @PostMapping("/signup")
//    public ResponseEntity<String> signup(@RequestBody SignupDTO dto) {
//        return shuttleOperatorService.signup(dto);
//    }
//
//
//    @PostMapping("/login")
//    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
//        boolean valid = shuttleOperatorService.validateCredentials(email, password);
//        if (valid) {
//            return ResponseEntity.ok("Login successful");
//        }
//        return ResponseEntity.badRequest().body("Invalid email or password");
//    }

    @PostMapping("/create")
    public ShuttleOperator create(@RequestBody ShuttleOperator operator) {
        return shuttleOperatorService.create(operator);
    }

    @GetMapping("/read/{id}")
    public ShuttleOperator read(@PathVariable Long id) {
        return shuttleOperatorService.read(id);
    }

    @PutMapping("/update")
    public ShuttleOperator update(@RequestBody ShuttleOperator operator) {
        return shuttleOperatorService.update(operator);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boolean deleted = shuttleOperatorService.delete(id);
        if (deleted) {
            return ResponseEntity.ok("Deleted successfully");
        }
        return ResponseEntity.badRequest().body("Operator not found");
    }

    @GetMapping("/getall")
    public List<ShuttleOperator> getAll() {
        return shuttleOperatorService.getAll();
    }
}
