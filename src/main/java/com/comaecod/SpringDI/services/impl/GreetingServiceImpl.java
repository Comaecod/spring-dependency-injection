package com.comaecod.SpringDI.services.impl;

import com.comaecod.SpringDI.services.GreetingService;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetThePerson()  {
        return "Hello, this works!";
    }
}
