package com.Siddu.BackendTracker.BackeEnd.Controller;



import com.Siddu.BackendTracker.BackeEnd.Model.Student;
import com.Siddu.BackendTracker.BackeEnd.Service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class RegisterController {

    @Autowired
    private StudentService studentService;

    
}
