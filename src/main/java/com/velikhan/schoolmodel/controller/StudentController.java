package com.velikhan.schoolmodel.controller;

import com.velikhan.schoolmodel.domain.Student;
import com.velikhan.schoolmodel.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/new")
    public Student newStudent(@RequestBody Student student){
        return studentService.newStudent(student);
    }

    @GetMapping("/list")
    public Iterable<Student> list() {
      return studentService.getAllStudents();
    }


}
