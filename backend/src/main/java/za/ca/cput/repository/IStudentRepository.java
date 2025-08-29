package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ca.cput.domain.Admin;
import za.ca.cput.domain.Student;

@Repository
public interface IStudentRepository extends JpaRepository<Student, Long> {
    Student findByEmail(String email);
}
