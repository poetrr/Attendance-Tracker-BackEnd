package com.Siddu.BackendTracker.BackeEnd.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Siddu.BackendTracker.BackeEnd.Model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
