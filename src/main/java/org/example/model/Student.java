package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "students")
@SequenceGenerator(name = "STUDENT_SEQUENCE", sequenceName = "STUDENTS_SEQUENCE_ID", allocationSize = 1)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Student {

    @Id
    @Getter
    @Setter
    private Integer id;
    @Getter
    @Setter
    private String serialNumber;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String surname;
    @Getter
    @Setter
    private String dateOfBirth;
    @Getter
    @Setter
    private String cf;
}
