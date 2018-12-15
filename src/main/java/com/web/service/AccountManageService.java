package com.web.service;

import com.web.model.Account;
import com.web.model.Result;

import javax.servlet.http.HttpSession;

public interface AccountManageService {

    Result<Object> login(HttpSession session, Account account);

    Result<Object> logout(HttpSession session);

    boolean isLogin(HttpSession session);

}
