package com.practice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

//		ApplicationContext context= SpringApplication.run(SpringbootApplication.class, args);
//		Student s1 = context.getBean(Student.class);  //Student s1 = new Student();
////        s1.age=21;  //singleton --> by default it will assign 21 for s2 also (one object itself)
////        //prototype --> it will not give any default value ,it will give zero
//		s1.study();
//        s1.writeexam();
////
////        Student s2 = context.getBean(Student.class);
////        System.out.println(s1.age+" "+s2.age);
        SpringApplication.run(SpringbootApplication.class, args);
	}
}

/*
            ->application context  - run method is executed and returns an object
            ->using SpringApplication class, the run method is called.

        context = SpringApplication.run(SpringbootApplication.class, args);
            ->it is of type application context, and thus,
        ApplicationContext context = SpringApplication.run(SpringbootApplication.class, args);
            -> ApplicationContext - this is a class

         */
