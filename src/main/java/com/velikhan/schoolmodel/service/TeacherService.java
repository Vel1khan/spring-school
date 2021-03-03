package com.velikhan.schoolmodel.service;

import com.velikhan.schoolmodel.domain.Teacher;
import com.velikhan.schoolmodel.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    public Teacher createTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }
}
