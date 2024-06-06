package com.techelevator;

public class Drink extends Item{
    public Drink(String name, double price) {
        super(name, price);
    }

    @Override
    public String getEatingNoise() {
        eatingNoise = "Glug Glug, Yum!";
        return super.getEatingNoise();
    }

}
