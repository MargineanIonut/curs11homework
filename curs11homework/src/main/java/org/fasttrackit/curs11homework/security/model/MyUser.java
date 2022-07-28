package org.fasttrackit.curs11homework.security.model;

import lombok.Builder;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

@Document("users")
@Builder
public record MyUser(
        @Id
        String userId,
        String username,
        String password,
        String city,
        List<String> roles
) {

}
