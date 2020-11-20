package com.essences;

import java.util.Objects;

public class ChocolateSweet extends ChocolateBar {

    private String sweetFiller;

    public ChocolateSweet(String name, double amountSugar, double sweetWeight, double sweetPrice, ChocolateType chocolateSweetType, int percentChocolate, String sweetFiller) {
        super(name, amountSugar, sweetWeight, sweetPrice, chocolateSweetType, percentChocolate);
        this.sweetFiller = sweetFiller;
    }


    public String getSweetFiller() {
        return sweetFiller;
    }

    public void setSweetFiller(String sweetFiller) {
        this.sweetFiller = sweetFiller;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChocolateSweet that = (ChocolateSweet) o;
        return Objects.equals(sweetFiller, that.sweetFiller);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetFiller);
    }

    @Override
    public String toString() {
        return "Шоколадная конфета:" + this.name + " содержание сахара " + amountSugar + "тип шоколада: "
                + super.getChocolateType() + " содержание какао: " + super.getPercentChocolate()
                + " наполнитель: " + getSweetFiller();

    }
}
