package com.microservices.accounts;

import com.microservices.accounts.dao.AccountRepository;
import com.microservices.accounts.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class AccountsApplication {

	@Autowired
	private AccountRepository accountRepository;

	public static void main(String[] args) {
		SpringApplication.run(AccountsApplication.class, args);
	}

	@PostConstruct
	public void init(){
		accountRepository.save(new Account(1L, "user1", "pass1"));
		accountRepository.save(new Account(2L, "user2", "pass2"));
		accountRepository.save(new Account(3L, "user3", "pass3"));
		accountRepository.save(new Account(4L, "user4", "pass4"));
		accountRepository.save(new Account(5L, "user5", "pass5"));
	}

}
