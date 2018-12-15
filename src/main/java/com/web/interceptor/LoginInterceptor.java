package com.web.interceptor;

import com.web.service.AccountManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Service
public class LoginInterceptor extends HandlerInterceptorAdapter {

    private final AccountManageService accountManageService;

    @Autowired
    public LoginInterceptor(AccountManageService accountManageService) {
        this.accountManageService = accountManageService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        boolean isLogin = accountManageService.isLogin(request.getSession());
        if (!isLogin) {
            response.sendRedirect("/static/login");
            return false;
        } else {
            return true;
        }
    }
}
