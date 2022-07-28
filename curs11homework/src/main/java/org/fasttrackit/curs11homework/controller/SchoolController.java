package org.fasttrackit.curs11homework.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs11homework.model.Student;
import org.fasttrackit.curs11homework.model.Teacher;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class SchoolController {


    @GetMapping("school-info")
    public String info() {
        return "This information is related to the school";
    }

    @GetMapping("students")
    public List<Student> students() {
        return List.of(new Student( "Ionut", 23),
                new Student( "Alex", 17),
                new Student( "Sorin", 35)
        );
    }

    @PostMapping("students")
    public Student addStudent() {
        return new Student("Student",23);
    }

    @PostMapping("teacher-evaluation")
    public Integer addScore(@RequestParam Integer score) {
        return score;
    }

    @PostMapping("teachers-adds")
    public Teacher addTeacher(@RequestBody Teacher teacher) {
        return new Teacher(teacher.name(),teacher.age(), teacher.discipline());
    }

}
