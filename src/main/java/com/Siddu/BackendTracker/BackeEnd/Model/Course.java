package com.Siddu.BackendTracker.BackeEnd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Course")
public class Course {

    @Id
    @Column(name = "Course_code", length = 10)
    private String courseCode;

    @Column(name = "Course_name", nullable = false, length = 100)
    private String courseName;

    // Constructors
    public Course() {}

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    // Getters and Setters
    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}
