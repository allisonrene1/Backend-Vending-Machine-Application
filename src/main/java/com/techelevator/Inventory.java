package com.techelevator;

import java.util.Map;
import java.util.TreeMap;

public class Inventory {
    FileReader fileReader = new FileReader();
    private TreeMap <String,Item> inventoryMap;

    public Inventory() {
        this.inventoryMap = fileReader.restockVendingMachine();
    }

    public TreeMap<String, Item> getInventoryMap() {
        return inventoryMap;
    }

    public String displayItemsForCustomer() {
        //Displays inventory in rows with slot number, name, price, and quantity remaining
        String items = "";
        for (Map.Entry<String,Item> entry : inventoryMap.entrySet()) {
           String item = (entry.getKey() + " " + entry.getValue().getName() + " $" + entry.getValue().getPrice() + " " + entry.getValue().getQuantity() + "\n");
           items = items.concat(item);
        }
        return items;
    }

    public String dispenseItem(String itemCode, int quantityToRemove, CashBox cashBox) {
        //Lowers item quantity by selected quantity and displays quantity, name, cost, and updates balance by subtracting cost of purchase
        inventoryMap.get(itemCode).setQuantity(inventoryMap.get(itemCode).getQuantity() - quantityToRemove);
        double newBalance = cashBox.getBalance() - inventoryMap.get(itemCode).getPrice() * quantityToRemove;
        cashBox.setBalance(newBalance);
        return (quantityToRemove + " " + inventoryMap.get(itemCode).getName() + " Price:$" + inventoryMap.get(itemCode).getPrice() + " Balance:$" + cashBox.getBalance() + "\n" + inventoryMap.get(itemCode).getEatingNoise() + "\n");
    }
}
