package com.example.Audit.controller;

import com.example.Audit.model.Student;
import com.example.Audit.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/audit")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/all")
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id) {
        studentRepository.deleteById(id);
    }

    @PostMapping("/create")
    public Student create(@RequestBody Student student) {
        return studentRepository.save(student);
    }
}
