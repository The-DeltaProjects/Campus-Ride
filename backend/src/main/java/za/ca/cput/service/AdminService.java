package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Admin;
import za.ca.cput.repository.IAdminRepository;
import za.ca.cput.util.dto.SignupDTO;

import java.util.List;

@Service
public class AdminService implements IAdminService {
    @Autowired
    IAdminRepository adminRepository;


    @Override
    public Admin create(Admin admin) {
        return adminRepository.save(admin);

    }

    @Override
    public Admin read(Long aLong) {
        return adminRepository.findById(aLong).orElse(null);

    }

    @Override
    public Admin update(Admin admin) {
        return adminRepository.save(admin);

    }

    @Override
    public boolean delete(Long id) {
        if (adminRepository.existsById(id)) {
            adminRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Admin> getAll() {
        return this.adminRepository.findAll();

    }

    public ResponseEntity<String> signup(SignupDTO dto) {
        // Email validation for Admin role
        if (!dto.getEmail().endsWith("@admin.cput.ac.za")) {
            return ResponseEntity.badRequest().body("Invalid admin email");
        }

        Admin admin = new Admin.Builder()
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setEmail(dto.getEmail())
                .setPassword(dto.getPassword())
                .build();

        adminRepository.save(admin);
        return ResponseEntity.ok("Admin registered successfully");
    }
    public boolean validateCredentials(String email, String password) {
        Admin admin = adminRepository.findByEmail(email);
        return admin != null && admin.getPassword().equals(password);
    }

    /* Additional admin-specific methods can be added here as needed */

//    //only an admin can edit a schedule
//    public Schedule editSchedule(Schedule schedule) {
//        if (schedule.getScheduleId() == null || !scheduleRepository.existsById(schedule.getScheduleId())) {
//            throw new IllegalArgumentException("Schedule not found");
//        }
//        return scheduleRepository.save(schedule);
//    }
//
//    // Edit Driver Profile
//    public ShuttleOperator editDriverProfile(ShuttleOperator driver) {
//        if (driver.getOperatorId() == null || !driverRepository.existsById(driver.getOperatorId())) {
//            throw new IllegalArgumentException("Driver not found");
//        }
//        return driverRepository.save(driver);
//    }
//
//    // Dashboard: count how many tickets a student booked
//    public int countTicketsByStudent(Long studentId) {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
//        return student.getBookings().size(); // assuming Student has bookings list
//    }
//
//    // Dashboard: count all bookings per schedule
//    public int countBookingsForSchedule(Long scheduleId) {
//        Schedule schedule = scheduleRepository.findById(scheduleId)
//                .orElseThrow(() -> new IllegalArgumentException("Schedule not found"));
//        return schedule.getBookings().size(); // assuming Schedule has bookings list
//    }
}
