package com.kafka.accountservice.kafka;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.kafka.accountservice.models.Account;
import com.kafka.accountservice.models.Transaction;
import com.kafka.accountservice.repositories.AccountRepository;
import com.kafka.accountservice.services.AccountService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.configurationprocessor.json.JSONObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class ConsumerKafka {

    @Autowired
    public AccountService accountService;
    @Autowired
    public AccountRepository accountRepository;

 /*   @KafkaListener(topics = "Transaction", groupId = "group_id")
    public void consume(String transaction)
    {
        JsonObject jsonObject = new JsonParser().parse(transaction).getAsJsonObject();
        double amount = jsonObject.get("amount").getAsDouble();
        Boolean inOrOut = jsonObject.get("inOrOut").getAsBoolean();
        //Transaction trans = new Transaction(transaction.)
        Account acc= accountService.getAccountById(9);
        if(inOrOut)
            acc.setBudget(acc.getBudget()+amount);
        else 
            acc.setBudget(acc.getBudget()-amount);
        accountService.save(acc);
        System.out.println("transakcija = " + jsonObject);
    }  
    */
    @KafkaListener(topics = "Transaction", groupId = "group_id")
    @SendTo("Notifications")
    String listenAndReply(String transaction) {
        JsonObject jsonObject = new JsonParser().parse(transaction).getAsJsonObject();
        double amount = jsonObject.get("amount").getAsDouble();
        Boolean inOrOut = jsonObject.get("inOrOut").getAsBoolean();
        //Transaction trans = new Transaction(transaction.)
        Account acc= accountService.getAccountById(9);
        if(inOrOut)
            acc.setBudget(acc.getBudget()+amount);
        else 
            acc.setBudget(acc.getBudget()-amount);
        accountService.save(acc);
        return "Your bugdet has been updated! You have " + acc.getBudget() +"KM on your account.";
    }
  
}