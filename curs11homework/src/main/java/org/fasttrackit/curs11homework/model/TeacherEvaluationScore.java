package org.fasttrackit.curs11homework.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

public record TeacherEvaluationScore(
        @MongoId
        String evaluationId,
        String teacherId,
        List<Integer> evaluationsScore
) {
    @Builder public TeacherEvaluationScore {}
}
