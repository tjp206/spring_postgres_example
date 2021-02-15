package com.example.demo.student;

import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;

@Service // Same as using '@Component' annotation
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "TJ",
                        "tjpataria@gcu.com",
                        LocalDate.of(1986, Month.OCTOBER, 1),
                        34
                )
        );
    }
}
