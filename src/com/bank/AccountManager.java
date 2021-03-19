package com.bank;

public class AccountManager extends Account {

    public AccountManager(String name, String startAmount) {
        super(name, startAmount);
    }

    public static void main (String[] args){
        Account anaSavingsAccount = new SavingsAccount("Savings Account", "200.00");

        System.out.println("Account " +anaSavingsAccount.getName()+ " created with the starting sum of "
                + anaSavingsAccount.getAmount());

        Account anaCheckingAccount = new CheckingAccount("Checking Account", "200.00",  2);

        anaSavingsAccount.withdraw("10");

        System.out.println(anaSavingsAccount.getAmount());


    }


}
