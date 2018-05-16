package com.github.egatlovs.sample.servicemocks.accountinfo;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

public class AccountInfoService {

    public AccountInformation getAccountInformation(String customerNumber) {
        return new AccountInformation();
    }
}
