package com.github.egatlovs.sample.servicemocks.customerinfo;

public class CustomerInfoService {

    public CustomerInformation getCustomerData(String customerNumber){
        return new CustomerInformation("Adam", "Beck", false);
    }

}
