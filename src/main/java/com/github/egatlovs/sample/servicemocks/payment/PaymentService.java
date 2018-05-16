package com.github.egatlovs.sample.servicemocks.payment;

import com.github.egatlovs.sample.camunda.tasks.debit.entity.AccountHolder;
import com.github.egatlovs.sample.camunda.tasks.debit.entity.DebitEntry;

public class PaymentService {

    public void debitAccount(AccountHolder accountHolder, DebitEntry debitEntry){
        // payment service logic
        System.out.println("Payment Service got called. AccountHolder: " + accountHolder.toString() + " DebitEntry: " + debitEntry.toString());
    }

}
