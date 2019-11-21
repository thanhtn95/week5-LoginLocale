package com.test.service;

import com.test.model.Account;
import com.test.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountRepository accountRepository;
    @Override
    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }
}
