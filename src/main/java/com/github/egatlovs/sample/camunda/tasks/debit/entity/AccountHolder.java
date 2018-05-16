package com.github.egatlovs.sample.camunda.tasks.debit.entity;

public class AccountHolder {

    private String forename;
    private String surname;
    private String customerNumber;
    private boolean vip;

    public AccountHolder() {
    }

    public AccountHolder(String forename, String surname, String customerNumber, boolean vip) {
        this.forename = forename;
        this.surname = surname;
        this.customerNumber = customerNumber;
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

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "AccountHolder{" +
                "forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", customerNumber='" + customerNumber + '\'' +
                ", vip=" + vip +
                '}';
    }
}
