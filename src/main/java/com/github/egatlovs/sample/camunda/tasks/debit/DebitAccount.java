package com.github.egatlovs.sample.camunda.tasks.debit;

import com.github.egatlovs.sample.camunda.tasks.debit.entity.PaymentInformation;
import com.github.egatlovs.sample.servicemocks.payment.PaymentService;
import com.github.egatlovs.variablemanager.managers.ExecutionManager;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Inject;
import javax.inject.Named;

@Named("debitAccount")
public class DebitAccount implements JavaDelegate {

    @Inject
    private ExecutionManager manager;

    @Inject
    private PaymentService service;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        PaymentInformation paymentInformation = manager.getVariable(PaymentInformation.class);
        service.debitAccount(paymentInformation.getAccountHolder(), paymentInformation.getDebitEntry());
    }

}
