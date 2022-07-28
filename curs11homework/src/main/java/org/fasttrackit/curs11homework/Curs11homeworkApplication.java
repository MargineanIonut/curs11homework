package org.fasttrackit.curs11homework;

import org.fasttrackit.curs11homework.repository.MyUserDepository;
import org.fasttrackit.curs11homework.security.model.MyUser;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class Curs11homeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs11homeworkApplication.class, args);
	}

	@Bean
	CommandLineRunner addUsers(MyUserDepository repo) {
		return args -> repo.saveAll(List.of(
				new MyUser(UUID.randomUUID().toString(), "student", "student", "Oradea", List.of("ROLE_STUDENT", "READ", "WRITE")),
				new MyUser(UUID.randomUUID().toString(), "teacher", "teacher", "Cluj", List.of("ROLE_TEACHER", "READ", "WRITE")),
				new MyUser(UUID.randomUUID().toString(), "director", "director", "Gherla", List.of("ROLE_DIRECTOR", "READ", "WRITE"))
				));
	}
}
