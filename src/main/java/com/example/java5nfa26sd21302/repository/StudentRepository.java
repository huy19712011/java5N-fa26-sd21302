package com.example.java5nfa26sd21302.repository;

import com.example.java5nfa26sd21302.entity.Student;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class StudentRepository {

    private final EntityManager em;

    public List<Student> getAllStudents() {

        return em.createQuery("from Student", Student.class).getResultList();
    }
}
