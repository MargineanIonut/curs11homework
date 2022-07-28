package org.fasttrackit.curs11homework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Curs11homeworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(Curs11homeworkApplication.class, args);
	}
//
//	@Bean
//	CommandLineRunner atStartup(StudentRepository repository){
//		return args -> {
//			repository.save(Student.builder()
//					.name("Ionut")
//					.age(23)
//					.build());
//			repository.save(Student.builder()
//					.name("Adi")
//					.age(17)
//					.build());
//		};
//	}
}
