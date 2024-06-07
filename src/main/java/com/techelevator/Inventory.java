package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    CashBox cashBox = new CashBox();
    TreeMap <String,Item> inventoryMap = new TreeMap<>();

    public String displayItemsForCustomer() {
        //Displays inventory in rows with slot numbe, name, price, and quantity remaining
        String items = "";
        for (Map.Entry<String,Item> entry : inventoryMap.entrySet()) {
           String item = (entry.getKey() + " " + entry.getValue() + "\n");
           items.concat(item);
        }
        return items;
    }

    public String dispenseItem(String itemCode, int quantityToRemove) {
        //Lowers item quantity by selected quantity and displays quantity, name, cost, and balance.
        inventoryMap.get(itemCode).setQuantity(inventoryMap.get(itemCode).getQuantity() - quantityToRemove);
        return (quantityToRemove + " " + inventoryMap.get(itemCode).getName() + " Price: $" + inventoryMap.get(itemCode).getPrice() + " Balance: $" + cashBox.getBalance() + "\n" + inventoryMap.get(itemCode).getEatingNoise());
    }
}
