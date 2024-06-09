package com.techelevator;

public class CashBox {
    private Double balance = 0.0;


    //a method to return change to customer after they've given money to the vending machine, + selected everything they want,
    //then click 3 for "finish the transaction"
    public String returnChange() {
        int cents = (int) (balance * 100);
        int quarters = cents / 25;
        cents = cents % 25;
        int dimes = cents /10;
        cents = cents % 10;
        int nickels = cents / 5;
        balance = 0.0;
        return (quarters + " quarters," + dimes + " dimes," + nickels + " nickels");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
