package org.example.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.salatino.andrea.openapistudent.api.StudentsApi;
import com.salatino.andrea.openapistudent.api.model.Students;
import lombok.extern.slf4j.Slf4j;
import org.example.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api/v1/students/")
@Slf4j
public class StudentController implements StudentsApi {

    private static final Logger LOGGER = LoggerFactory.getLogger(StudentController.class);

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private StudentService studentService;

    @Override
    public Optional<ObjectMapper> getObjectMapper() {
        return Optional.of(objectMapper);
    }

    @Override
    public Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    @Override
    public ResponseEntity<Students> getStudents() {
        LOGGER.info("Calling the getStudents API!");

        Students students = studentService.retriveAllStudents();

        if (students == null || students.isEmpty())
            return ResponseEntity.status(HttpStatus.NOT_FOUND.value()).build();

        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> keepAlive() {
        return null;
    }
}
