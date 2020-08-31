package com.kafka.accountservice.services;

import com.kafka.accountservice.repositories.AccountRepository;

import java.util.List;

import com.kafka.accountservice.models.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;


    public void save(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(Integer id) {
        return accountRepository.findById(id).get();
    }

    public void delete(int id) {
        accountRepository.deleteById(id);
    }

}