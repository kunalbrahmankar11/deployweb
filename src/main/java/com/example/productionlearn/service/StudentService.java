package com.example.productionlearn.service;

import com.example.productionlearn.model.Student;
import com.example.productionlearn.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    public List<Student> getall(){
        return studentRepository.findAll();
    }

    public Student getDataById(String id){
        return studentRepository.findById(id).orElse(null);
    }

    public void saveData(Student student){
        studentRepository.save(student);
    }
}
