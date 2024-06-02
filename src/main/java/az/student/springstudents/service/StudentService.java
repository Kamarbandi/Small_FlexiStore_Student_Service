package az.student.springstudents.service;

import az.student.springstudents.modul.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deletedStudent(String email);
}
