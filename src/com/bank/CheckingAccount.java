package com.bank;

import java.math.BigDecimal;

public class CheckingAccount extends Account {

    private int numberOfSignatoires;
    public static final BigDecimal minimumAmount = new BigDecimal("100.00") ;

    public CheckingAccount(String name, String startAmount, int initialSigns) {
        super(name, "10.00");
        this.setNumberOfSignatoires(initialSigns);
    }

    public int getNumOfSignatoires() {
        return numberOfSignatoires;
    }

    public void setNumberOfSignatoires(int input) {
        numberOfSignatoires=input;
    }

    @Override
    public void withdraw(String demandedAmount) {
        BigDecimal withdrawalAmount = new BigDecimal(demandedAmount);
        if (this.getAmount().compareTo(withdrawalAmount.add(minimumAmount)) <0 ) {
            throw new IllegalArgumentException();
        } else {
            super.withdraw(demandedAmount);
        }
    }

    @Override
    public String toString() {
        return "Saving Account" + super.toString();
    }
}
