package com.example.java5nfa26sd21302.controller;

import com.example.java5nfa26sd21302.entity.Student;
import com.example.java5nfa26sd21302.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/students")
    public String listStudents(Model model) {

        // get data from DB
        List<Student> students = studentService.getAllStudents();

        // send data to view
        model.addAttribute("students", students);

        return "views/students";
    }
}
