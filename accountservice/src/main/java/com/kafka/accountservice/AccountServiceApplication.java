package com.kafka.accountservice;

import com.kafka.accountservice.models.Account;
import com.kafka.accountservice.repositories.AccountRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}

	
	@Bean
    public CommandLineRunner run(AccountRepository accountRepository) throws Exception {
        return (String[] args) -> {
            Account acc1 = new Account(1567.3, 0.5, 1000);
			
            accountRepository.save(acc1);
			
		
        }; 
	}
	
}
