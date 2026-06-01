package com.practice.springboot.Service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String greeting() {
        return "from helloservice";
    }

    public String lecture() {
        return "from helloservice !!";
    }
}