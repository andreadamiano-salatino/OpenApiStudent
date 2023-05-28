package org.example.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;


@Entity
@Table(name = "students")
@SequenceGenerator(name = "STUDENTS_SEQUENCE", sequenceName = "STUDENTS_SEQUENCE_ID", allocationSize = 1)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Student {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="STUDENTS_SEQUENCE")
    private Integer  id;
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
    private Date dateOfBirth;
    @Getter
    @Setter
    private String cf;
}
