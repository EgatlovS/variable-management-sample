package com.github.egatlovs.sample.camunda.tasks.debit.entity;

import com.github.egatlovs.variablemanager.annotations.FieldName;

import java.math.BigDecimal;

public class DebitEntry {

    @FieldName(name="totalPrice")
    private BigDecimal price;
    @FieldName(name = "orderId")
    private String usage;

    public DebitEntry() {
    }

    public DebitEntry(BigDecimal price, String usage) {
        this.price = price;
        this.usage = usage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    @Override
    public String toString() {
        return "DebitEntry{" +
                "price=" + price +
                ", usage='" + usage + '\'' +
                '}';
    }
}
