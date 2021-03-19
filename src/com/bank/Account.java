package com.bank;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Account {

    private String name;
    private BigDecimal amount = null;

    // constructor
    public Account(String name, String startAmount) {
        setName(name);
        setAmount(amount);
        this.amount.setScale(2, RoundingMode.HALF_UP);
    }

    private void withdraw(){};
    private void deposit(){};

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal initialAmount){
        amount = amount;
    }
}
