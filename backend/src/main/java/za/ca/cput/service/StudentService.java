package za.ca.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import za.ca.cput.domain.Student;
import za.ca.cput.repository.IStudentRepository;
import za.ca.cput.util.dto.SignupDTO;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    private IStudentRepository studentRepository;


    @Override
    public Student create(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student read(Long aLong) {
        return studentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Student update(Student student) {
        return studentRepository.save(student);
    }

    public boolean delete(Long id) {
        if (studentRepository.existsById(id)) {
            studentRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }


    public ResponseEntity<String> signup(SignupDTO dto) {
        // Email validation: student emails must end with "@student.com"
        if (!dto.getEmail().endsWith("@mycput.ac.za")) {
            return ResponseEntity.badRequest().body("Invalid student email");
        }

        Student student = new Student.Builder()
                .setFirstName(dto.getFirstName())
                .setLastName(dto.getLastName())
                .setEmail(dto.getEmail())
                .setPassword(dto.getPassword())
                .build();

        studentRepository.save(student);
        return ResponseEntity.ok("Student registered successfully");
    }

    public boolean validateCredentials(String email, String password) {
        Student student = studentRepository.findByEmail(email);
        return student != null && student.getPassword().equals(password);
    }
}
