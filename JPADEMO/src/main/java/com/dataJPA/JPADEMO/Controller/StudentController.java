package com.dataJPA.JPADEMO.Controller;

import com.dataJPA.JPADEMO.Model.Student;
import com.dataJPA.JPADEMO.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return s.getAllStudents();
    }
}
