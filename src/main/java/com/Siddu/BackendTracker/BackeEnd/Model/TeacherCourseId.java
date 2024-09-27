package com.Siddu.BackendTracker.BackeEnd.Model;

import java.io.Serializable;

public class TeacherCourseId implements Serializable {

    private int teacherId;
    private String courseCode;

    // Constructors, Getters, Setters, equals, and hashCode
    public TeacherCourseId() {}

    public TeacherCourseId(int teacherId, String courseCode) {
        this.teacherId = teacherId;
        this.courseCode = courseCode;
    }

    // equals and hashCode methods for composite key equality
}
