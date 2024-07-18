package com.Developers.School_Management_System.modal;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "TeacherTble")
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "FullName")
    private String fullName;

    @Column(name = "DateOfBirth")
    private Date DateOfBirth;


    private String className;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "Address")
    private String Address;

    @Column(name = "Phone")
    private String Phone;



    @Column(name = "Email")
    private String email;

    @Column(name = "age")
    private int Age;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Hiredate")
    private Date hireDate;
}
