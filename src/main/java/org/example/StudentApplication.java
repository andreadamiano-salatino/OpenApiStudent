package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SpringApplication.run(StudentApplication.class, args);
    }
}