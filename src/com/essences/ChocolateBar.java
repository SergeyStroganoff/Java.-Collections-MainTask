package com.essences;

public class ChocolateBar extends Sweets {

    ChocolateType chocolateBarType;
    int percentChocolate;

    public ChocolateBar(String name, double amountSugar, double sweetWeight, double sweetPrice, ChocolateType chocolateBarType, int percentChocolate) {
        super(name, amountSugar, sweetWeight, sweetPrice);
        this.chocolateBarType = chocolateBarType;
        this.percentChocolate = percentChocolate;
    }
}
