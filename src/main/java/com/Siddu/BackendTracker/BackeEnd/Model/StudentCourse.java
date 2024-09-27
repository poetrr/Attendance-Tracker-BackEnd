package com.Siddu.BackendTracker.BackeEnd.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "StudentCourse")
@IdClass(StudentCourseId.class) // Composite key handling
public class StudentCourse {

    @Id
    @Column(name = "Roll_no")
    private int rollNo;

    @Id
    @Column(name = "Course_code", length = 10)
    private String courseCode;

    @Column(name = "Attendance_percentage", precision = 5, scale = 2, columnDefinition = "DECIMAL(5,2) DEFAULT 0.00")
    private double attendancePercentage = 0.00;

    // Constructors
    public StudentCourse() {}

    public StudentCourse(int rollNo, String courseCode, double attendancePercentage) {
        this.rollNo = rollNo;
        this.courseCode = courseCode;
        this.attendancePercentage = attendancePercentage;
    }

    // Getters and Setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public void setAttendancePercentage(double attendancePercentage) {
        this.attendancePercentage = attendancePercentage;
    }
}

