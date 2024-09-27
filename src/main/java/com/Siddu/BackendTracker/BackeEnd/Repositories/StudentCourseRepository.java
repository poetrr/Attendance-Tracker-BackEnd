package com.Siddu.BackendTracker.BackeEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Siddu.BackendTracker.BackeEnd.Model.TeacherCourse;
import com.Siddu.BackendTracker.BackeEnd.Model.TeacherCourseId;

public interface StudentCourseRepository extends JpaRepository<TeacherCourse, TeacherCourseId>{

}
