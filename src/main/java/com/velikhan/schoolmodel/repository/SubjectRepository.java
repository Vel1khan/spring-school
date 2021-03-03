package com.velikhan.schoolmodel.repository;

import com.velikhan.schoolmodel.domain.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
