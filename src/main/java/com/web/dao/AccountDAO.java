package com.web.dao;

import com.web.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountDAO extends JpaRepository<Account, Integer> {

    List<Account> findAllByNameAndPassword(String name, String password);
}
