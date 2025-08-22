package org.javiteq.spring6di.controllers;

import org.javiteq.spring6di.services.GreetingService;
import org.javiteq.spring6di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello() {
        System.out.println("Hello from MyController");
        return greetingService.sayGreeting();
    }
}
