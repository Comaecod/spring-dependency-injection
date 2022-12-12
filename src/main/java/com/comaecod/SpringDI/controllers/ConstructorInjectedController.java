package com.comaecod.SpringDI.controllers;

import com.comaecod.SpringDI.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String saySomething() {
        return greetingService.greetThePerson();
    }
}
