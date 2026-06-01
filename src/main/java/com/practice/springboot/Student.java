package com.practice.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")  //@Scope("singleton")
public class Student {
    @Autowired
    @Qualifier("Pencil")
    Writer w;

    public void study(){
        System.out.println("i am doing engineering");
    }

    public void writeexam(){
        w.write();
    }
   // int age;
//    @Autowired                   //field injection
//    Pen p ; //new Pen();

//    Pen p;
//    @Autowired                  //constructor injection
//    public Student(Pen p) {
//        this.p = p;
//    }

//    Pen p;
//    @Autowired
//    public void setP(Pen p) {                //setter injection
//        this.p = p;                          // this is tight coupling
//    }

//    public Student(){
//        System.out.println("student object created");
//    }

}
