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
}
