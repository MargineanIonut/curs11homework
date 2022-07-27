package org.fasttrackit.curs11homework.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

public record Teacher(
        @MongoId
        String id,
        String name,
        String age,
        String discipline,
        String evaluationId
) {
    @Builder
    public Teacher{}

}
