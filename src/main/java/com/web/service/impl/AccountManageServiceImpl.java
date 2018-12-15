package com.web.service.impl;

import com.web.dao.AccountDAO;
import com.web.model.Account;
import com.web.model.Result;
import com.web.service.AccountManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class AccountManageServiceImpl implements AccountManageService {

    private static final String USER_KEY = "USER_NAME";

    private final AccountDAO accountDAO;

    @Autowired
    public AccountManageServiceImpl(AccountDAO accountDAO) {
        this.accountDAO = accountDAO;
    }

    @Override
    public Result<Object> login(HttpSession session, Account account) {
        if (session.getAttribute(USER_KEY) != null) {
            return new Result<>(true, "您已经登录，无需再次登录", null);
        }

        String name = account.getName();
        String password = account.getPassword();
        List<Account> accounts = accountDAO.findAllByNameAndPassword(name, password);
        boolean isAccountValid = accounts != null && accounts.size() == 1;

        if (isAccountValid) {
            session.setAttribute(USER_KEY, name);
            return new Result<>(true, "登录成功", null);
        } else {
            return new Result<>(false, "账户名和密码不匹配", null);
        }
    }

    @Override
    public Result<Object> logout(HttpSession session) {
        session.invalidate();
        return new Result<>(true, "成功登出", null);
    }

    @Override
    public boolean isLogin(HttpSession session) {
        return session.getAttribute(USER_KEY) != null;
    }
}
