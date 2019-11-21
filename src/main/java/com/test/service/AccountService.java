package com.test.service;

import com.test.model.Account;

public interface AccountService {
    Iterable<Account> findAll();
}
