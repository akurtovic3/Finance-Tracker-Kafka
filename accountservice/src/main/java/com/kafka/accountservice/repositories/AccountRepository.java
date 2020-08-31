package com.kafka.accountservice.repositories;

import org.springframework.stereotype.Repository;

import java.util.List;

import com.kafka.accountservice.models.Account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
}