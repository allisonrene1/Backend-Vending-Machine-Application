package com.techelevator;

import java.util.Scanner;

public class UI {

        private Scanner myScanner = new Scanner(System.in);



    public int showMainMenu() {

        //print main menu and return the user's choice:

        System.out.println("(1) Display Vending Machine Items");
        System.out.println("(2) Purchase");
        System.out.println("(3) Exit");

        return Integer.parseInt(myScanner.nextLine());

    }

    public String askUserOptions() {
        System.out.println();
        return myScanner.nextLine();
    }




    public int askUserInt(String message) {
        System.out.println(message);
        return Integer.parseInt(myScanner.nextLine());
    }

    public void outPutString(String message) {
        System.out.println(message);
    }




}
