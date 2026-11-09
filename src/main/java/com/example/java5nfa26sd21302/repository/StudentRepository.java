package com.example.java5nfa26sd21302.repository;

import com.example.java5nfa26sd21302.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
@RequiredArgsConstructor
public class StudentRepository {

    private final EntityManager em;

    public List<Student> getAllStudents() {

        return em.createQuery("from Student", Student.class).getResultList();
    }

    public void saveStudent(Student student) {

        em.persist(student);
    }

    public Student getStudentById(long id) {

        return em.find(Student.class, id);
    }

    public void updateStudent(Student student) {

        em.merge(student);
    }

    public void deleteStudentById(long id) {

        em.remove(em.find(Student.class, id));
    }
}
