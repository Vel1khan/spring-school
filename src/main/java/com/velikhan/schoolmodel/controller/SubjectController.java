package com.velikhan.schoolmodel.controller;

import com.velikhan.schoolmodel.domain.Subject;
import com.velikhan.schoolmodel.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @PostMapping("/new")
    Subject newSubject(@RequestBody Subject subject) {
       return subjectService.createSubject(subject);
    }

    @PutMapping("/{subjectId}/students/{studentId}")
    Subject enrollStudentToSubject(
            @PathVariable Long subjectId,
            @PathVariable Long studentId
    ) {
        return subjectService.enrollStudentToSubject(subjectId, studentId);
    }
}
