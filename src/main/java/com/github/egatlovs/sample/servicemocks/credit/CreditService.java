package com.github.egatlovs.sample.servicemocks.credit;

import java.math.BigDecimal;

public class CreditService {

    public BigDecimal getCredit(String customerNumber){
        System.out.println("Credit service invoked with customer " + customerNumber + " has 10.00$");
        return new BigDecimal("10.00");
    }

}
