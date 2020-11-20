package com.essences;

import java.util.Objects;

public class ChocolateBar extends Sweets {

    private final ChocolateType chocolateBarType;
    private final int percentChocolate;

    public ChocolateBar(String name, double amountSugar, double sweetWeight, double sweetPrice, ChocolateType chocolateBarType, int percentChocolate) {
        super(name, amountSugar, sweetWeight, sweetPrice);
        this.chocolateBarType = chocolateBarType;
        if (percentChocolate <= 0 || percentChocolate > 100) percentChocolate = 50;
        this.percentChocolate = percentChocolate;

    }
    public ChocolateType getChocolateType() {
        return chocolateBarType;
    }

    public int getPercentChocolate() {
        return percentChocolate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChocolateBar that = (ChocolateBar) o;
        return percentChocolate == that.percentChocolate &&
                chocolateBarType == that.chocolateBarType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(chocolateBarType, percentChocolate);
    }

    @Override
    public String toString() {
        return "Плита шоколада:" + this.name + " содержание сахара " + amountSugar + "тип шоколада: " + chocolateBarType + " содержание какао: " + percentChocolate;
    }
}
