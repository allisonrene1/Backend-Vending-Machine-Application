package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.util.TreeMap;

public class FileReader {


    public TreeMap restockVendingMachine() {

        //creating a new tree map, where the vending machine items are stored
        TreeMap <String,Item> loadingMap = new TreeMap<>();

        String filePath = "vendingmachine.csv";
        File vendingRestock = new File(filePath);

        try(Scanner fileInput= new Scanner(vendingRestock)) {
            // Loop over all of the vending machine items until the end of file is reached
            while(fileInput.hasNextLine()) {
                /* Going over each line in the vending machine, then putting those items into a string
                array and splitting them with a vertical line between each time */
                String restockEntry = fileInput.nextLine();
                String[] restockArray = restockEntry.split("\\|");

                //checking the 3rd index of the array to see which class to call,
                //and then making the "key" the 0 index, AKA the item code,
                //and then creating a new instance of a chip/candy/drink/gum class. Calling the constructor of each class
                //to set the values of the key:value pair at index 1 and index 2 AKA the name of the item + the price.
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
        //the final tree map w/ everything from the vending machine file
        return loadingMap;
    }
}

