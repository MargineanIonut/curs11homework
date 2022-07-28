package org.fasttrackit.curs11homework.repository;

import org.fasttrackit.curs11homework.security.model.MyUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MyUserDepository extends MongoRepository<MyUser, String> {
    Optional<MyUser> findByUsername(String username);
}
