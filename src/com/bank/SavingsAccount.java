package com.bank;

import java.math.BigDecimal;

public class SavingsAccount extends Account{
    private final BigDecimal initialSum = new BigDecimal("20.00");

    public SavingsAccount(String name, String startAmount) {
        super(name, startAmount);
    }

    private BigDecimal deposit (String depositedSum){
        return new BigDecimal(depositedSum).add(initialSum);
    };

    private void withdraw() throws Exception {
        System.out.println("You can't withdraw money from savings account");
    };
}
