package com.practice.springboot.controller;

import com.practice.springboot.Service.StudentService;
import com.practice.springboot.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    private int StudId;
    private String name;
    private int age;

    public StudentController(int StudId, String name, int age) {
        this.StudId = StudId;
        this.name = name;
        this.age = age;
    }

    public StudentController( ) {

    }

    public int getStudId() {
        return StudId;
    }

    public void setStudId(int studId) {
        this.StudId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Autowired
    StudentService s1;

    @GetMapping("studid")
    public int getstudId(){
        return s1.getstudId();
    }

    @GetMapping("name")
    public String getname(){
        return s1.getname();
    }

    @GetMapping("age")
    public int getage(){
        return s1.getage();
    }

    @PostMapping("addStudent")
    public StudentController addStudent(@RequestBody StudentController as){
        return as;
    }





}


