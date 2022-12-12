package com.comaecod.SpringDI.controllers;

import com.comaecod.SpringDI.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PropertyInjectedController {
    @Autowired
    public GreetingService greetingService;

    public String saySomething() {
        return greetingService.greetThePerson();
    }
}
