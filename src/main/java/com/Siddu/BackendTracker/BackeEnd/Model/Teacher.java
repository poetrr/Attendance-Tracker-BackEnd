package com.Siddu.BackendTracker.BackeEnd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the ID
    @Column(name = "Teacher_id")
    private int teacherId;

    @Column(name = "Teacher_name", nullable = false)
    private String teacherName;

    @Column(name = "Institution_name", nullable = false)
    private String institutionName;

    @Column(name = "Teacher_email", unique = true, nullable = false)
    private String teacherEmail;

    // Constructors
    public Teacher() {}

    public Teacher(String teacherName, String institutionName, String teacherEmail) {
        this.teacherName = teacherName;
        this.institutionName = institutionName;
        this.teacherEmail = teacherEmail;
    }

    // Getters and Setters
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }
}

