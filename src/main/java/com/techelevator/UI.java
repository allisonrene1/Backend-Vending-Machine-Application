package com.techelevator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class UI {

    private Scanner myScanner = new Scanner(System.in);
    CashBox cashBox = new CashBox();
    Inventory inventory = new Inventory();

    public int showMainMenu() {

        //print main menu and return the user's choice:

        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");

        return myScanner.nextInt();
    }

    public int showPurchaseMenu(Double balance) {

        //print purchase menu and return the user's choice:

        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Current Money Provided: $");
        System.out.println(balance);

        return myScanner.nextInt();
    }

    public void feedMoney() {
        //Asks for integer between 1 and 10 to add to balance
        int moneyToAdd = 0;
        while (moneyToAdd <= 0 || moneyToAdd > 10) {
            System.out.println("Add money to the machine in whole dollar amounts between 1-10");
            moneyToAdd = myScanner.nextInt();
            if (moneyToAdd <= 0 || moneyToAdd > 10) {
                System.out.println("Invalid Input");
            } else {
               cashBox.setBalance(cashBox.getBalance() + moneyToAdd);
            }
        }
    }
    public String askUserProduct() {
        //Asks user for item code
        System.out.println("Enter a code to select an item");
        return myScanner.nextLine();
    }
    public int askUserQuantity() {
        //Asks user for item quantity
        System.out.println("Enter the quantity that you would like to purchase");
        return myScanner.nextInt();
    }

    public boolean isValidItem(String itemCode) {
        //checks inventory to see if it contains requested item
        return inventory.inventoryMap.containsKey(itemCode);
    }

    public boolean isValidQuantity(String itemCode, int quantity) {
        //Checks item as defined by item code to see if requested quantity is available
        if (inventory.inventoryMap.get(itemCode).getQuantity() >= quantity) {
            return true;
        } else {
            return false;
        }
    }

    public int askUserInt(String message) {
        //Asks user for an integer based on a provided question
        System.out.println(message);
        return myScanner.nextInt();
    }

    public void outPutString(String message) {
        //Asks user for a String based on a provided question
        System.out.println(message);
    }
}
