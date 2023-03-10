package com.kodilla.spring.hello.world;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping(value = "hello")
    public String hello() {
        return "Hello world from Spring Java Application!!!";
    }

}
