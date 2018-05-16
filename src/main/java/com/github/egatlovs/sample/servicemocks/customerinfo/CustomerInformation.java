package com.github.egatlovs.sample.servicemocks.customerinfo;

import com.github.egatlovs.variablemanager.annotations.ObjectValue;

@ObjectValue(storeFields = true)
public class CustomerInformation {

    private String forename;
    private String surname;
    private boolean vip;

    public CustomerInformation() {
    }

    public CustomerInformation(String forename, String surname, boolean vip) {
        this.forename = forename;
        this.surname = surname;
        this.vip = vip;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}
