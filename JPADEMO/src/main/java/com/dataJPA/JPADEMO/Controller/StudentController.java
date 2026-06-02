package com.dataJPA.JPADEMO.Controller;

import com.dataJPA.JPADEMO.Model.Student;
import com.dataJPA.JPADEMO.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService s;

    @GetMapping("students")
    public List<Student> getAllStudents(){
        return s.getAllStudents();
    }
    @PostMapping("students")
    public String addStudent(@RequestBody Student std){
        return s.addStudent(std);
    }
    @GetMapping("students/{id}")
    public Student getStudentByRollno(@PathVariable("id") int roll){
        return s.getStudentByRoll(roll);
    }
    @PutMapping("updateStudent")
    public String updateStudent(@RequestBody Student std){
        return s.updateStudent(std);
    }
    @DeleteMapping("deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int roll){
        return s.deleteStudent(roll);
    }
    @DeleteMapping("students")
    public String deleteAllStudents(){
        return s.deleteAll();
    }

    //custom methods
    @GetMapping("students/custom")       //method2 using param
    public List<Student> getStudentByTech(@Param("tech") String tech){
        return s.getAllStudentsByTech(tech);
    }

    @GetMapping("students/custom1")
    public List<Student> getStudentByRnoAndTech(@Param("rno") int rno, @Param("tech") String tech){
        return s.getAllStudentsByRnoAndTech(rno,tech);
    }

    //method 2   -->@pathVariable la one parameter matum than pass panna mudiyum
    @GetMapping("student/{tech}")
    public List<Student> getstudentByTech(@PathVariable("tech") String tech){
        return s.getStudentByTech(tech);
    }

    //query write pandra naala post mapping
    @GetMapping("students/filter")  //@PostMapping um podalam no issues
    public List<Student> getStudentByNameAndTech(@Param("name") String name , @Param("tech") String tech){
        return s.getAllStudentsByNameAndTech(name,tech);
    }


    //jpl
    @PostMapping("/students/byjpql")
    public List<Student>getstudentbyjpql(@Param("name") String name)
    {
        return s.getstudentbyjpql(name);
    }
}