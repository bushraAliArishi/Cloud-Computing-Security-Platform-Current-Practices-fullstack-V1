package com.example.backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/cloud_computing_security_platform")
public class TestController {

    @GetMapping("/test")
    public String sayHello() {
        return "Hello from Spring Boot!";
    }
}
