package com.springsecurity.section03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact")
    public String getContactDetails() {
        return "Welcome to the contact Page!!!";
    }
}
