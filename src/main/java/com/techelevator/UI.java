package com.techelevator;

import java.util.Scanner;

public class UI {

    private Scanner myScanner = new Scanner(System.in);

    public int showMainMenu() {

        //print main menu and return the user's choice:

        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");

        int choice = myScanner.nextInt();
        myScanner.nextLine();
        return choice;
    }

    public int showPurchaseMenu(Double balance) {

        //print purchase menu and return the user's choice:

        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Current Money Provided: $");
        System.out.println(balance);

        int choice = myScanner.nextInt();
        myScanner.nextLine();
        return choice;
    }

    public void feedMoney(CashBox cashBox) {
        //Asks for integer between 1 and 10 to add to balance
        int moneyToAdd = 0;
        while (moneyToAdd <= 0 || moneyToAdd > 10) {
            System.out.println("Add money to the machine in whole dollar amounts between 1-10");
            moneyToAdd = myScanner.nextInt();
            myScanner.nextLine();
            if (moneyToAdd <= 0 || moneyToAdd > 10) {
                System.out.println("Invalid Input");
            } else {
               cashBox.setBalance(moneyToAdd + cashBox.getBalance());
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
        int quantity = myScanner.nextInt();
        myScanner.nextLine();
        return quantity;

    }

    public boolean isValidItem(String itemCode) {
        Inventory inventory = new Inventory();
        //checks inventory to see if it contains requested item
        return inventory.getInventoryMap().containsKey(itemCode);
    }

    public boolean isValidQuantity(String itemCode, int quantity) {
        Inventory inventory = new Inventory();
        //Checks item as defined by item code to see if requested quantity is available
        if (inventory.getInventoryMap().get(itemCode).getQuantity() >= quantity) {
            return true;
        } else {
            return false;
        }
    }

    public void outPutString(String message) {
        //Asks user for a String based on a provided question
        System.out.println(message);
    }
}
