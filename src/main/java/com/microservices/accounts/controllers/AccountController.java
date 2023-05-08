package com.microservices.accounts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/accounts")
public class AccountController {

    @GetMapping
    public String getAllAccounts(){
        //TODO : add AccountService
        return "test";
    }
}
