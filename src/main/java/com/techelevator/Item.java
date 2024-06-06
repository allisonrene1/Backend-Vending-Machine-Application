package com.techelevator;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public int getQuantity() {
        return quantity;
    }

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

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 10;
    }
}
