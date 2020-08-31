package com.kafka.transactionservice.controllers;

import com.kafka.transactionservice.models.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionKafkaController {
    @Autowired
    KafkaTemplate<String, Transaction> kafkaTemplate;

    private static final String TOPIC = "Transaction";

    @PostMapping(value="/transaction")
    public String publishTransaction(@RequestBody Transaction transaction)
    {
        kafkaTemplate.send(TOPIC, transaction);
        return "Published Successfully!";
    }
}