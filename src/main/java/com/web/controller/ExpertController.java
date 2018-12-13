package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExpertController {

    @GetMapping("/static/expert")
    public String getExpertPage() {
        return "expert/expert";
    }

    @GetMapping("/static/expert/create")
    public String getExpertCreatePage() {
        return "expert/expert-create";
    }

    @GetMapping("/static/expert/modify")
    public String getExpertModifyPage() {
        return "expert/expert-modify";
    }
}
