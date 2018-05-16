package com.github.egatlovs.sample.camunda.tasks.debit.entity;

import com.github.egatlovs.variablemanager.annotations.ObjectValue;

@ObjectValue(storeFields = true)
public class PaymentInformation {

    @ObjectValue(storeFields = true)
    private AccountHolder accountHolder;
    @ObjectValue(storeFields = true)
    private DebitEntry debitEntry;

    public PaymentInformation() {
    }

    public PaymentInformation(AccountHolder accountHolder, DebitEntry debitEntry) {
        this.accountHolder = accountHolder;
        this.debitEntry = debitEntry;
    }

    public AccountHolder getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(AccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public DebitEntry getDebitEntry() {
        return debitEntry;
    }

    public void setDebitEntry(DebitEntry debitEntry) {
        this.debitEntry = debitEntry;
    }

    @Override
    public String toString() {
        return "PaymentInformation{" +
                "accountHolder=" + accountHolder +
                ", debitEntry=" + debitEntry +
                '}';
    }
}
