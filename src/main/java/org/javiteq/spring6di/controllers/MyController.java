package org.javiteq.spring6di.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello from MyController");
        return "hello";
    }
}
