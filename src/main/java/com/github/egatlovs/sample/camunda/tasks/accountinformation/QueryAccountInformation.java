package com.github.egatlovs.sample.camunda.tasks.accountinformation;

import com.github.egatlovs.sample.camunda.tasks.customerdata.entity.Customer;
import com.github.egatlovs.sample.servicemocks.accountinfo.AccountInfoService;
import com.github.egatlovs.sample.servicemocks.accountinfo.AccountInformation;
import com.github.egatlovs.variablemanager.managers.ExecutionManager;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Inject;
import javax.inject.Named;

@Named("queryAccountInformation")
public class QueryAccountInformation implements JavaDelegate {

    @Inject
    private ExecutionManager manager;

    @Inject
    private AccountInfoService service;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Customer customer = manager.getVariable(Customer.class);
        AccountInformation information = service.getAccountInformation(customer.getCustomerNumber());
        manager.setVariable(information);
    }
}
