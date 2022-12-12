package com.comaecod.SpringDI.services.impl;

import com.comaecod.SpringDI.services.GreetingService;
import org.springframework.stereotype.Component;

@Component
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetThePerson()  {
        return "Hello, this works!";
    }
}
