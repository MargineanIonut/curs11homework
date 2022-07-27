package org.fasttrackit.curs11homework.repository;

import org.fasttrackit.curs11homework.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
