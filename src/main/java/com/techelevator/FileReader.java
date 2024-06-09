package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {


    public TreeMap restockVendingMachine() {

        
        TreeMap <String,Item> loadingMap = new TreeMap<>();
        String filePath = "vendingmachine.csv";
        File vendingRestock = new File(filePath);

        try(Scanner fileInput= new Scanner(vendingRestock)) {
            // Loop until the end of file is reached
            while(fileInput.hasNextLine()) {
                // Read the next line into 'restockEntry'
                String restockEntry = fileInput.nextLine();
                String[] restockArray = restockEntry.split("\\|");

                if (restockArray[3].equals("Chip")) {
                    loadingMap.put(restockArray[0], new Chip(restockArray[1], Double.parseDouble(restockArray[2])));
                } else if (restockArray[3].equals("Candy")) {
                    loadingMap.put(restockArray[0], new Candy(restockArray[1], Double.parseDouble(restockArray[2])));
                } else if (restockArray[3].equals("Drink")) {
                    loadingMap.put(restockArray[0], new Drink(restockArray[1], Double.parseDouble(restockArray[2])));
                } else if (restockArray[3].equals("Gum")) {
                    loadingMap.put(restockArray[0], new Gum(restockArray[1], Double.parseDouble(restockArray[2])));
                } else {
                    //TODO: DON'T FORGET TO FIX THIS LATER!!!!!!
                    loadingMap.put(restockArray[0], new Item(restockArray[1], Double.parseDouble(restockArray[2])));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return loadingMap;
    }
}

