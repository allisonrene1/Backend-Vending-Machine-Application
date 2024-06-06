package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileReader extends Inventory{

    String filePath = "vendingmachine.csv";
    File vendingRestock = new File(filePath);
    Scanner fileInput;{
        try {
            fileInput = new Scanner(vendingRestock);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        // Loop until the end of file is reached
        while (fileInput.hasNextLine()) {
            // Read the next line into 'restockEntry'
            String restockEntry = fileInput.nextLine();
            String[] restockArray = restockEntry.split("\\|");

            if (restockArray[3].equals("Chip")) {
                inventoryMap.put(restockArray[0],new Chip(restockArray[1], Double.parseDouble(restockArray[2])));
            } else if(restockArray[3].equals("Candy")) {
                inventoryMap.put(restockArray[0], new Candy(restockArray[1], Double.parseDouble(restockArray[2])));
            } else if(restockArray[3].equals("Drink")) {
                inventoryMap.put(restockArray[0], new Drink(restockArray[1], Double.parseDouble(restockArray[2])));
            } else if(restockArray[3].equals("Gum")) {
                inventoryMap.put(restockArray[0], new Gum(restockArray[1], Double.parseDouble(restockArray[2])));
            } else {
                //TODO: DON'T FORGET TO FIX THIS LATER!!!!!!
                inventoryMap.put(restockArray[0], new Item(restockArray[1], Double.parseDouble(restockArray[2])));
            }

        }
    }
}

