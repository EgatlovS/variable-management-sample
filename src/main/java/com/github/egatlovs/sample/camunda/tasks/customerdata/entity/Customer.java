package com.github.egatlovs.sample.camunda.tasks.customerdata.entity;

import com.github.egatlovs.variablemanager.annotations.ObjectValue;

@ObjectValue(storeFields = true)
public class Customer {

    private String customerNumber;

    public Customer() {
    }

    public Customer(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerNumber='" + customerNumber + '\'' +
                '}';
    }
}
