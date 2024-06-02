package az.student.springstudents.service.impl;

import az.student.springstudents.modul.Student;
import az.student.springstudents.repository.StudentRepository;
import az.student.springstudents.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private final StudentRepository repository;

//    public StudentServiceImpl(StudentRepository repository) { // we reliazed this with bibiliotek lombok with anotation @AllArgsConstructor
//        this.repository = repository;
//    }

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findStudentByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public void deletedStudent(String email) {
        repository.deleteByEmail(email);
    }
}
