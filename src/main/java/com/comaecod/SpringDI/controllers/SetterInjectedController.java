package com.comaecod.SpringDI.controllers;

import com.comaecod.SpringDI.services.GreetingService;

public class SetterInjectedController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String saySomething() {
        return greetingService.greetThePerson();
    }
}
