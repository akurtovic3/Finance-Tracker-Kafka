package com.kafka.accountservice.models;
/*
public class Transaction {

    private double amount;
    private Boolean inOrOut;

    public Transaction(double amount, Boolean inOrOut){
        this.amount=amount;
        this.inOrOut=inOrOut;
    }
    public Boolean getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(Boolean inOrOut) {
        this.inOrOut = inOrOut;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
*/

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

public class Transaction {
   
    private Integer id; 
    //private Date date;
    private double amount;
    private String title;
    private String itemDescription;
    private Boolean inOrOut;
/*
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
*/
    public void setId( Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Boolean getInOrOut() {
        return inOrOut;
    }

    public void setInOrOut(Boolean inOrOut) {
        this.inOrOut = inOrOut;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    
    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", inOrOut=" + inOrOut +
                ", amount=" + amount +
                '}';
    }
}