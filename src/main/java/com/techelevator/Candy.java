package com.techelevator;

public class Candy extends Item{
    public Candy(String name, double price) {
        super(name, price);
    }

    @Override
    public String getEatingNoise() {
        eatingNoise = "Munch Munch, Yum!";
        return super.getEatingNoise();
    }

}
