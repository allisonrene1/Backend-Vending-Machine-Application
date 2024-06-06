package com.techelevator;

import java.util.Scanner;

public class UI {

        private Scanner myScanner = new Scanner(System.in);

    public String askUserString(String message) {
        System.out.println(message);
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
