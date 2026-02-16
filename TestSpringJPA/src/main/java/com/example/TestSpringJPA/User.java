package com.example.TestSpringJPA;

import jakarta.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String student;
    private String studentId;
    private Double cgpa;

    public User() {}

    public User(String student, String studentId, Double cgpa) {
        this.student = student;
        this.studentId = studentId;
        this.cgpa = cgpa;
    }

    public Long getId() {
        return id;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Double getCgpa() {
        return cgpa;
    }

    public void setCgpa(Double cgpa) {
        this.cgpa = cgpa;
    }
}
