package com.Siddu.BackendTracker.BackeEnd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "TeacherCourse")
@IdClass(TeacherCourseId.class) // Composite key handling
public class TeacherCourse {

    @Id
    @Column(name = "Teacher_id")
    private int teacherId;

    @Id
    @Column(name = "Course_code", length = 10)
    private String courseCode;

    // Constructors
    public TeacherCourse() {}

    public TeacherCourse(int teacherId, String courseCode) {
        this.teacherId = teacherId;
        this.courseCode = courseCode;
    }

    // Getters and Setters
    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
