package com.aligunes.controller;

import com.aligunes.model.Student;
import com.aligunes.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentService studentService;

    public List<Student> getAllStudents(){

        return studentService.getAllStudens();
    }
}
