package za.ca.cput.service;

import za.ca.cput.domain.Student;

import java.util.List;

public interface IStudentService extends IService<Student, Long> {
    List<Student> getAll();
}


