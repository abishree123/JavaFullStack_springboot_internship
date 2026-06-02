package com.dataJPA.JPADEMO.Service;

import com.dataJPA.JPADEMO.Model.Student;
import com.dataJPA.JPADEMO.Repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    Repo r;
    public List<Student> getAllStudents(){
        return r.findAll();
    }

    public String addStudent(Student std) {
        r.save(std);
        return "Successful";
    }

    public Student getStudentByRoll(int roll) {
        return  r.findById(roll).orElse(new Student());
    }

    public String updateStudent(Student std) {
        r.save(std);
        return "Update Successful";
    }

    public String deleteStudent(int roll) {
        r.deleteById(roll);
        return "Successful";
    }

    public String deleteAll() {
        r.deleteAll();
        return "All Students deleted";
    }

    //custom method
    public List<Student> getAllStudentsByTech(String tech) {
        return r.findByTech(tech);
    }

    public List<Student> getAllStudentsByRnoAndTech(int rno , String tech ){
         return r.findByRnoAndTech(rno,tech);
    }

    public List<Student> getStudentByTech(String tech) {
        return r.findByTech(tech);
    }

    public List<Student> getAllStudentsByNameAndTech(String name, String tech) {
        return r.findByNameAndTech(name,tech);
    }

    //jpl
    public List<Student> getstudentbyjpql(String name) {
        return r.findbyName(name);
    }
}