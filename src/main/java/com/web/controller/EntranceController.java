package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntranceController {

    @GetMapping("/")
    public String entrance() {
        return "login";
    }

    @GetMapping("/static/login")
    public String login() {
        return "login";
    }

}
