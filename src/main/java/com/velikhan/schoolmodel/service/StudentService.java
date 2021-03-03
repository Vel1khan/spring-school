package com.velikhan.schoolmodel.service;

import com.velikhan.schoolmodel.domain.Student;
import com.velikhan.schoolmodel.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student newStudent(Student student) {
        return studentRepository.save(student);
    }
}
