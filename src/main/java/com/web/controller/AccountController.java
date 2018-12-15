package com.web.controller;

import com.web.model.Account;
import com.web.model.Result;
import com.web.service.AccountManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class AccountController {

    private final AccountManageService accountManageService;

    @Autowired
    public AccountController(AccountManageService accountManageService) {
        this.accountManageService = accountManageService;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result<Object> login(HttpServletRequest request, @RequestBody Account account) {
        HttpSession session = request.getSession();
        return accountManageService.login(session, account);
    }

    @RequestMapping("/logout")
    public Result<Object> logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return accountManageService.logout(session);
    }
}
