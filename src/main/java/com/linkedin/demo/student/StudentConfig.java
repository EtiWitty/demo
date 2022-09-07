package com.linkedin.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {

  @Bean
  CommandLineRunner commandLineRunner(StudentRepository repository) {
    return args -> {
       Student atiyeh = new Student(
          "Atiyeh",
          "atiyeh.atiyeh@gmail.com",
          LocalDate.of(2000, Month.JANUARY, 5),
          21
      );

     Student alex = new Student(
          "Alex",
          "alex.alex@gmail.com",
          LocalDate.of(2004, Month.JANUARY, 5),
          21
      );

      repository.saveAll(Arrays.asList(atiyeh, alex)
          );
    };
  }
}
