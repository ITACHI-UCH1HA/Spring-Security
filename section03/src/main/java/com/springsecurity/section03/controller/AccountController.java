package com.springsecurity.section03.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/myaccount")
    public String getMyAccount() {
        return "get MyAccount details from the DB";
    }
}
