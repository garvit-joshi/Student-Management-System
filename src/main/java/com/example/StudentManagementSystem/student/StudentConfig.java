package com.example.StudentManagementSystem.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student garvit = new Student( "Garvit Joshi", "garvitjoshi9@gmail.com", LocalDate.of(2000, Month.OCTOBER, 9));
            Student pratik = new Student( "Pratik", "pratik@gmail.com", LocalDate.of(2001, Month.APRIL, 21));
            repository.saveAll(List.of(garvit, pratik));
        };
    }
}
