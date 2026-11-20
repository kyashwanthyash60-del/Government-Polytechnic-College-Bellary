package com.example.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
    @GetMapping("/")
    public String welcome() {
        return "<h1>Welcome to SpringBoot Security</h1>";
    }
}
