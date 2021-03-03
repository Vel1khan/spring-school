package com.velikhan.schoolmodel.controller;

import com.velikhan.schoolmodel.domain.Teacher;
import com.velikhan.schoolmodel.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/new")
    Teacher newTeacher(@RequestBody Teacher teacher){
        return teacherService.createTeacher(teacher);
    }
}
