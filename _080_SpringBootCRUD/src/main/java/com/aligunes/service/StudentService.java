package com.aligunes.service;

import com.aligunes.model.Student;
import com.aligunes.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudens() {
        return studentRepository.findAll();
    }
}
