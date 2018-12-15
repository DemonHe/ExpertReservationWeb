package com.service.controller;

import com.service.model.Result;
import com.service.model.Service;
import com.service.service.ServiceManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/service")
public class ServiceController {

    @Autowired
    ServiceManageService serviceManageService;

    @RequestMapping(value="/create")
    public Result create(@RequestBody Service service){
        return serviceManageService.addService(service);
    }
}
