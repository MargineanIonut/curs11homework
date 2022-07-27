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
    public String info(){
        return "This information is related to the school";
    }

    @GetMapping("students")
    public List<Student> students(){
        return service.getAllStudents();
    }

    @PostMapping("students")
    public Student addStudent(@RequestBody Student student){
        return service.add(student);
    }

//    @PostMapping
//    public TeacherEvaluationScore addScore(){
//
//    }
}
