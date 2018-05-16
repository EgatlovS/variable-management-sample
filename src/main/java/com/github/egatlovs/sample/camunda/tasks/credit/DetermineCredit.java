package com.github.egatlovs.sample.camunda.tasks.credit;

import com.github.egatlovs.sample.camunda.tasks.customerdata.entity.Customer;
import com.github.egatlovs.sample.servicemocks.credit.CreditService;
import com.github.egatlovs.variablemanager.managers.ExecutionManager;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigDecimal;

@Named("determineCredit")
public class DetermineCredit implements JavaDelegate {

    @Inject
    private ExecutionManager manager;

    @Inject
    private CreditService service;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Customer customer = manager.getVariable(Customer.class);
        BigDecimal credit = service.getCredit(customer.getCustomerNumber());
        manager.getExecutionService().setVariable("credit", credit);
    }

}
