package com.bank;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    private final BigDecimal deposit = new BigDecimal("20.00");

    public SavingsAccount(String name, String startAmount) {
        super(name, startAmount);
    }


}
