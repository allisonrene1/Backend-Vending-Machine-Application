package com.techelevator;

public class CashBox {
    private Double balance = 0.0;

    public String returnChange() {
        //converts balance into change and returns balance to zero
        int quarters = (int) (balance * 100) / 25;
        balance = (balance * 100) % 25;
        int dimes = (int) (balance /10);
        balance = balance % 100;
        int nickels = (int) (balance / 5);
        balance = 0.0;
        return (quarters + " quarters," + nickels + " nickels," + dimes + " dimes,");
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
