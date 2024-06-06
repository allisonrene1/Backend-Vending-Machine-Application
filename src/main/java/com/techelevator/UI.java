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

        //print main menu and return the user's choice:

        System.out.println("(1) Feed Money");
        System.out.println("(2) Select Product");
        System.out.println("(3) Finish Transaction");
        System.out.print("Current Money Provided: $");
        System.out.println(balance);

        return myScanner.nextInt();
    }
    public void feedMoney() {
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
    public void askUserProduct() {
        System.out.println("Enter a code to select an item");
        String itemCode = myScanner.nextLine();
    }
    public void askUserQuantity() {
        System.out.println("Enter the quantity that you would like to purchase");
        int itemQuantity = myScanner.nextInt();
    }

    public boolean isValidItem(String itemCode) {
        return inventory.inventoryMap.containsKey(itemCode);
    }

    public boolean isValidQuantity(String itemCode, int quantity) {
        if (inventory.inventoryMap.get(itemCode).getQuantity() >= quantity) {
            return true;
        } else {
            return false;
        }
    }

    public String askUserOptions() {
        System.out.println();
        return myScanner.nextLine();
    }





    public int askUserInt(String message) {
        System.out.println(message);
        return myScanner.nextInt();
    }

    public void outPutString(String message) {
        System.out.println(message);
    }




}
