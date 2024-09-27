package com.Siddu.BackendTracker.BackeEnd.Model;

import java.io.Serializable;

public class StudentCourseId implements Serializable {
	
    private int rollNo;
    private String courseCode;

    // Constructors, Getters, Setters, equals, and hashCode
    public StudentCourseId() {}

    public StudentCourseId(int rollNo, String courseCode) {
        this.rollNo = rollNo;
        this.courseCode = courseCode;
    }

    // equals and hashCode methods for composite key equality
}
