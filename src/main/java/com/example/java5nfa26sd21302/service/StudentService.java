package com.example.java5nfa26sd21302.service;

import com.example.java5nfa26sd21302.entity.Student;
import com.example.java5nfa26sd21302.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {

        return studentRepository.getAllStudents();
    }
}
