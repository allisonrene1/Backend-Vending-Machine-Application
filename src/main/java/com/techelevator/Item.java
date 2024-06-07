package com.techelevator;

public class Item {
    private String name;
    private double price;
    private int quantity;
    public String eatingNoise;


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getEatingNoise() {
        return eatingNoise;
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantity = 10;
    }
}
