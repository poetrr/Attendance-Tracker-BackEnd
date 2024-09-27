package com.Siddu.BackendTracker.BackeEnd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Automatically generates the ID
    @Column(name = "Roll_no")
    private int rollNo;

    @Column(name = "Student_name", nullable = false)
    private String studentName;

    @Column(name = "Email", unique = true, nullable = false)
    private String email;

    @Column(name = "Year_of_Study", nullable = false)
    private int yearOfStudy;

    @Column(name = "Course_Branch", nullable = false)
    private String courseBranch;

    @Column(name = "Semester", nullable = false)
    private int semester;

    // Constructors
    public Student() {}

    public Student(String studentName, String email, int yearOfStudy, String courseBranch, int semester) {
        this.studentName = studentName;
        this.email = email;
        this.yearOfStudy = yearOfStudy;
        this.courseBranch = courseBranch;
        this.semester = semester;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public String getCourseBranch() {
        return courseBranch;
    }

    public void setCourseBranch(String courseBranch) {
        this.courseBranch = courseBranch;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
