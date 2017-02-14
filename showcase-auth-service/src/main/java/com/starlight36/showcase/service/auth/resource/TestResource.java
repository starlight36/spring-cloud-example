package com.starlight36.showcase.service.auth.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestResource {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, world.";
    }
}
