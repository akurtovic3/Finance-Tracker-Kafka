package com.kafka.accountservice.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account", schema = "targetSchemaName")
public class Account {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "budget")
    private double budget;
    @Column(name = "totalLimit")
    private double totalLimit;
    @Column(name = "monthLimit")
    private double monthLimit;

    public Account(){
        
    }
    public Account(double budget, double totalLimit, double monthLimit){
        this.budget=budget;
        this.monthLimit=monthLimit;
        this.totalLimit=totalLimit;
    }
    public Account(Integer id, double budget, double totalLimit, double monthLimit){
        this.id=id;
        this.budget=budget;
        this.monthLimit=monthLimit;
        this.totalLimit=totalLimit;
    }
    public double getBudget() {
        return budget;
    }

    public double getMonthLimit() {
        return monthLimit;
    }

    public void setMonthLimit(double monthLimit) {
        this.monthLimit = monthLimit;
    }

    public double getTotalLimit() {
        return totalLimit;
    }

    public void setTotalLimit(double totalLimit) {
        this.totalLimit = totalLimit;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

}