package com.techelevator;

public abstract class InventoryItem {
    private String name;
    private double price;
    private String slotLocation;
    private int totalSales;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public InventoryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
