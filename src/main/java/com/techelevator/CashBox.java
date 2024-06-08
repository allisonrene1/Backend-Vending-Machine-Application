package com.techelevator;

public class CashBox {
    private Double balance = 0.0;

    public String returnChange() {
        //converts balance into change and returns balance to zero
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
