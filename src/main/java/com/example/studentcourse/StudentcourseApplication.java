package com.example.studentcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.studentcourse.model.Course;
import com.example.studentcourse.repository.CourseRepository;

@SpringBootApplication
public class StudentcourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentcourseApplication.class, args);
    }

    @Bean
    public CommandLineRunner demoCourses(CourseRepository courseRepo) {
        return args -> {
            if (courseRepo.count() == 0) {
                Course math = new Course();
                math.setCourseName("Math");

                Course science = new Course();
                science.setCourseName("Science");

                Course history = new Course();
                history.setCourseName("History");

                courseRepo.save(math);
                courseRepo.save(science);
                courseRepo.save(history);
            }
        };
    }
}
