package com.Siddu.BackendTracker.BackeEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Siddu.BackendTracker.BackeEnd.Model.Course;

public interface CourseRepository extends JpaRepository<Course, String>{

}
