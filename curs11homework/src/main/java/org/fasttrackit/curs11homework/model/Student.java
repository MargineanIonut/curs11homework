package org.fasttrackit.curs11homework.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.MongoId;

public record Student(String name, Integer age) {
@Builder public Student{}
}
