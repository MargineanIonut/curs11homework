package org.fasttrackit.curs11homework;

import org.fasttrackit.curs11homework.model.Student;
import org.fasttrackit.curs11homework.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Curs11homeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs11homeworkApplication.class, args);
	}

	@Bean
	CommandLineRunner atStartup(StudentRepository repository){
		return args -> {
			repository.save(Student.builder()
					.name("Ionut")
					.age(23)
					.build());
			repository.save(Student.builder()
					.name("Adi")
					.age(17)
					.build());
		};
	}
}
