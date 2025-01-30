package com.example.spring_sec_demo.controller;

import com.example.spring_sec_demo.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class StudentController {

    List<Student> students = new ArrayList<>(List.of(
        new Student(1, "navin", "Java"),
        new Student(2, "kiran", "Blockchain")
    ));

//    @GetMapping("csrf-token")
//    public CsrfToken getCsrfToken(HttpServletRequest request){
//        return (CsrfToken) request.getAttribute("_csrf");
//    }

    @GetMapping("students")
    public List<Student> getStudents() {
        return students;
    }

    @PostMapping("students")
    public void addstudent(@RequestBody Student student){
        students.add(student);
    }
}
