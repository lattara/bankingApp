package com.bank;

public class AccountManager extends Account {

    public AccountManager(String name, String startAmount) {
        super(name, startAmount);
    }

    public static void main (String[] args){
        Account anaAccount = new Account("First account", "200.00");
        System.out.println("Account " +anaAccount.name+ " created with the starting sum of " + anaAccount.amount);
    }


}
