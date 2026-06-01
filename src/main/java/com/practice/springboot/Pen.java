package com.practice.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Qualifier("Pen")
public class Pen implements Writer {
    public void write(){
        System.out.println("write exam using pen");
    }
}
