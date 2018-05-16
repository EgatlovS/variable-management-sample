package com.github.egatlovs.sample.camunda.tasks.customerdata;

import com.github.egatlovs.sample.camunda.tasks.customerdata.entity.Customer;
import com.github.egatlovs.sample.servicemocks.customerinfo.CustomerInfoService;
import com.github.egatlovs.sample.servicemocks.customerinfo.CustomerInformation;
import com.github.egatlovs.variablemanager.managers.ExecutionManager;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

import javax.inject.Inject;
import javax.inject.Named;

@Named("determineCustomerData")
public class DetermineCustomerData implements JavaDelegate {

    @Inject
    private ExecutionManager manager;

    @Inject
    private CustomerInfoService service;

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        Customer customer = manager.getVariable(Customer.class);
        CustomerInformation information = service.getCustomerData(customer.getCustomerNumber());
        manager.setVariable(information);
    }
}
