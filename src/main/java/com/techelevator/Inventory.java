package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    TreeMap <String,Item> inventoryMap = new TreeMap<>();


    public String displayItemsForCustomer() {
        String items = "";
        for (Map.Entry<String,Item> entry : inventoryMap.entrySet()) {
           String item = (entry.getKey() + entry.getValue());
           items.concat(item);
        }
        return items;
    }


}
