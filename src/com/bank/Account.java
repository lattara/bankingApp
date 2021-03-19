package com.bank;
import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Account {

    private String name;
    private BigDecimal amount = null;

    // constructor
    public Account(String name, String startAmount) {
        setName(name);
        setAmount(startAmount);
        this.amount.setScale(2, RoundingMode.HALF_UP);
    }

    public void withdraw(String withdrawAmount) throws IllegalArgumentException {
        BigDecimal withdrawal = new BigDecimal(withdrawAmount);

        // if amount is negative
        if (withdrawal.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount can't be negative number");

        // if amount we want to withdraw is less than amount on the account
        } else if (amount.compareTo(withdrawal) < 0)  {
            throw new IllegalArgumentException("Insufficient founds");
        } else {

            // subtract the desired amount from current amount and return it as a string
            this.setAmount(getAmount().subtract(withdrawal).toString());
        }
    };

    public void deposit (String depositAmount) throws IllegalArgumentException {
        BigDecimal depositedAmount = new BigDecimal(depositAmount);
        if (depositedAmount.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount can't be negative");
        } else {
            setAmount(getAmount().add(depositedAmount).toString());
        }

    };

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(String initialAmount){
        amount = new BigDecimal(initialAmount);
    }


    @Override
    public String toString() {
        return "Account" + super.toString();
    }
}
