package org.example.service;

import com.salatino.andrea.openapistudent.api.model.Students;
import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Students retrieveAllStudents() {

        List<Student> retrievedStudents = new ArrayList<Student>() {{
            studentRepository.findAll().forEach(this::add);
        }};

        if (retrievedStudents.isEmpty())
            return null;

        Students students = new Students();

        for (Student student : retrievedStudents) {
            com.salatino.andrea.openapistudent.api.model.Student outputStudent = new com.salatino.andrea.openapistudent.api.model.Student();
            outputStudent.setSerialNumber(student.getSerialNumber());
            outputStudent.setName(student.getName());
            outputStudent.setSurname(student.getSurname());
            if(student.getDateOfBirth() != null){
                outputStudent.setDateOfBirth(student.getDateOfBirth().toString());
            }
            outputStudent.setCf(student.getCf());
            students.add(outputStudent);

        }

        return students;
    }
}
