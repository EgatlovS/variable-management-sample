package com.github.egatlovs.sample.servicemocks.customerinfo;

public class CustomerInfoService {

    public CustomerInformation getCustomerData(String customerNumber){
        System.out.println("Information about customer " + customerNumber + " requested");
        return new CustomerInformation("Adam", "Beck", false);
    }

}
