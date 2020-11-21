package com.essences;

public class Sweets {

    protected String name;
    protected double amountSugar;
    protected double sweetWeight;
    protected double sweetPrice;

    public Sweets(String name, double amountSugar, double sweetWeight, double sweetPrice) {
        this.name = name;
        this.amountSugar = amountSugar;
        this.sweetWeight = sweetWeight;
        this.sweetPrice = sweetPrice;
    }

    public String getName() {
        return name;
    }

    public double getAmountSugar() {
        return amountSugar;
    }

    public double getSweetWeight() {
        return sweetWeight;
    }

    public double getSweetPrice() {
        return sweetPrice;
    }
}


