package br.com.telefonica.spring.security.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayHello() {
        return "Welcome to Spring Application with out Security";
    }
}
