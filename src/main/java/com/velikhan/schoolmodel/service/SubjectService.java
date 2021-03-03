package com.velikhan.schoolmodel.service;

import com.velikhan.schoolmodel.domain.Student;
import com.velikhan.schoolmodel.domain.Subject;
import com.velikhan.schoolmodel.repository.StudentRepository;
import com.velikhan.schoolmodel.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Autowired
    StudentRepository studentRepository;

    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    public Subject enrollStudentToSubject(Long subjectId, Long studentId) {
        Subject subject = subjectRepository.findById(subjectId).get();
        Student student = studentRepository.findById(studentId).get();
        subject.enrollStudent(student);
        return subjectRepository.save(subject);
    }
}
