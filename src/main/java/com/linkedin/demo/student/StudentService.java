package com.linkedin.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class StudentService {
  public List<Student> getStudents() {
    return Arrays.asList(new Student(
        1L,
        "Atiyeh",
        "atiyeh.atiyeh@gmail.com",
        LocalDate.of(2000, Month.JANUARY, 5),
        21
    ));
  }
}
