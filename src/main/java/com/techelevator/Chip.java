package com.techelevator;

public class Chip extends Item{



    public Chip(String name, double price) {
        super(name, price);
    }


    @Override
    public String getEatingNoise() {
        eatingNoise = "Crunch Crunch, Yum!";
        return super.getEatingNoise();
    }
}
