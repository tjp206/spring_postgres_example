package com.example.demo.student;

import com.sun.tools.javac.util.List;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student tj = new Student(
                    "TJ",
                    "tjpataria@gcu.com",
                    LocalDate.of(1986, OCTOBER, 1)
            );

            Student ayla = new Student(
                    "Ayla",
                    "ayla@harvard.com",
                    LocalDate.of(2020, JULY, 24)
            );

            studentRepository.saveAll(
                    List.of(tj, ayla)
            );
        };
    }
}
