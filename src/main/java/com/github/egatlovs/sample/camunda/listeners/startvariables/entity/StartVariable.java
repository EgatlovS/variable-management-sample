package com.github.egatlovs.sample.camunda.listeners.startvariables.entity;

import com.github.egatlovs.variablemanager.annotations.ObjectValue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@ObjectValue(storeFields = true)
public class StartVariable {

    private String customerNumber;
    private List<Article> articles;
    private BigDecimal totalPrice;

    public StartVariable() {
        this.customerNumber = UUID.randomUUID().toString();
        this.articles = new ArrayList<>();
        this.totalPrice = new BigDecimal("220.99");
    }

    public StartVariable(String customerNumber, List<Article> articles, BigDecimal totalPrice) {
        this.customerNumber = customerNumber;
        this.articles = articles;
        this.totalPrice = totalPrice;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(BigDecimal totalPrice) {
        this.totalPrice = totalPrice;
    }
}
