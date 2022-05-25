package com.ecs.eks.sample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @GetMapping("/")
    public String helloWorld() {
        System.out.println("This is in HelloWorld Method");
        return "Hello World!!!";
    }

    @GetMapping("/greetings")
    public String greeting(@RequestHeader("name") String name) {
        System.out.println("This is in Greetings Method");
        return "Hello " + name + "!!!";
    }
}
