package org.fasttrackit.curs11homework.repository;

import org.fasttrackit.curs11homework.model.TeacherEvaluationScore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Evaluation extends MongoRepository<TeacherEvaluationScore, String> {
}
