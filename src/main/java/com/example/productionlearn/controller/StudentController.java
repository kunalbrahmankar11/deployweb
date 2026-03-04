package com.example.productionlearn.controller;


import com.example.productionlearn.model.Student;
import com.example.productionlearn.service.StudentService;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    private StudentService studentService;
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllData(){
        return studentService.getall();
    }

    @GetMapping("/{id}")
    public Student getbydataId(@PathVariable String id){
        return studentService.getDataById(id);
    }

    @PostMapping("/save")
    public void saveAll(@RequestBody Student student){
        studentService.saveData(student);
    }
}
