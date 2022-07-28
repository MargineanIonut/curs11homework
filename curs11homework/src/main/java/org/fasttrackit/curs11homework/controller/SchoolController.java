package org.fasttrackit.curs11homework.controller;

import lombok.RequiredArgsConstructor;
import org.fasttrackit.curs11homework.model.Student;
import org.fasttrackit.curs11homework.model.Teacher;
import org.fasttrackit.curs11homework.model.TeacherEvaluationScore;
import org.fasttrackit.curs11homework.service.SchoolService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class SchoolController {

    private final SchoolService service;

    @GetMapping("school-info")
    public String info() {
        return "This information is related to the school";
    }

    @GetMapping("students")
    public List<Student> students() {
        return List.of(new Student(null, "Ionut", 23),
                new Student(null, "Alex", 17),
                new Student(null, "Sorin", 35)
        );
    }

    @PostMapping("students")
    public String addStudent() {
        return "Student added";
    }

    @PostMapping("teacher-evaluation")
    public String addScore() {
        return "Score for teacher added";
    }

    @PostMapping("teachers-adds")
    public String addTeacher() {
        return "Score for teacher added";
    }

}
