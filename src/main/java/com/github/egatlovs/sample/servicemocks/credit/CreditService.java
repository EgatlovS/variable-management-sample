package com.github.egatlovs.sample.servicemocks.credit;

import java.math.BigDecimal;

public class CreditService {

    public BigDecimal getCredit(String customerNumber){
        return new BigDecimal("10.00");
    }

}
