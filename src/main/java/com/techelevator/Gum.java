package com.techelevator;

public class Gum extends Item{
    public Gum(String name, double price) {
        super(name, price);
    }

    @Override
    public String getEatingNoise() {
        eatingNoise = "Chew Chew, Yum!";
        return super.getEatingNoise();
    }

}
