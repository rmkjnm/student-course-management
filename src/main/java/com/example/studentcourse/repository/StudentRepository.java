package com.example.studentcourse.repository;

import com.example.studentcourse.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
