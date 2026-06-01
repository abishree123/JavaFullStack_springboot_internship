package com.practice.springboot.Service;

import com.practice.springboot.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
     public int getstudId(){
         return 4;
     }

     public String getname(){
         return "Abi";
     }

     public int getage(){
         return 19;
     }


    public String addStudent(String name){
         return name + "added successfully";
     }
}
