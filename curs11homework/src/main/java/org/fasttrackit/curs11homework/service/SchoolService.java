package org.fasttrackit.curs11homework.service;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs11homework.model.Student;
import org.fasttrackit.curs11homework.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {

    public final StudentRepository repository;

    public List<Student> getAllStudents() {
       return repository.findAll();
    }

    public Student add(Student student) {
        return repository.save(student);
    }
}
