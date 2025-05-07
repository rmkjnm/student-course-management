package com.example.studentcourse.repository;

import com.example.studentcourse.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
