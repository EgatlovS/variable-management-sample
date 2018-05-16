package com.github.egatlovs.sample.servicemocks.accountinfo;

import com.github.egatlovs.variablemanager.annotations.ObjectValue;

@ObjectValue(storeFields = true)
public class AccountInformation {

    private String iban;
    private String bic;

    public AccountInformation() {
    }

    public AccountInformation(String iban, String bic) {
        this.iban = iban;
        this.bic = bic;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public String getBic() {
        return bic;
    }

    public void setBic(String bic) {
        this.bic = bic;
    }
}
