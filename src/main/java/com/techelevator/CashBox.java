package com.techelevator;

public class CashBox {
    private int balance;


    public String returnChange() {
        //converts balance into change and returns balance to zero
        int quarters =  (balance * 100) / 25;
        balance = (balance * 100) % 25;
        int dimes = balance /10;
        balance = balance % 100;
        int nickels = balance / 5;
        balance = 0;
        return (quarters + " quarters," + nickels + " nickels," + dimes + " dimes,");
    }





    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
