package com.anudip.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Demo {

    @Autowired
    Laptop laptop;
    public void code(){
        laptop.compile();
        System.out.println("code for demo");
    }
}
