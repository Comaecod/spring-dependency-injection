package com.comaecod.SpringDI.controllers;

import com.comaecod.SpringDI.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;

    public String saySomething() {
        return greetingService.greetThePerson();
    }
}
