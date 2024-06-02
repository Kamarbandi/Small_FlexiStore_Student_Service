package az.student.springstudents.repository;

import az.student.springstudents.modul.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);
}
