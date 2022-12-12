package com.comaecod.SpringDI.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@Component
public class MyController {
    public String sayHello() {
        return "Hello Vishnu";
    }
}
