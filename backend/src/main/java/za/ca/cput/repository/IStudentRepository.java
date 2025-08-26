package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.Student;

public interface IStudentRepository extends JpaRepository<Student, String> {
}
