package com.microservices.accounts.services;

import com.microservices.accounts.dao.AccountRepository;
import com.microservices.accounts.model.Account;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }
}
