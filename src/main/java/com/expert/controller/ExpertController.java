package com.expert.controller;

import com.expert.service.ExpertManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/expert")
public class ExpertController {

    @Autowired
    private ExpertManageService expertManageService;

    @RequestMapping(value="/test")
    public String test(){
        return "test";
    }

}
