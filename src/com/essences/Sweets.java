package com.essences;

import java.util.Comparator;
import java.util.Objects;

public class Sweets implements Validate {

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

    public static Comparator<? super Sweets> comparatorBySweetPrice() {
        return (o1, o2) -> (int) (o1.getSweetPrice() - o2.getSweetPrice());  // причина приведения типа и как минимизировать погрешности при расчетах если double
    }

    public static Comparator<? super Sweets> comparatorBySweetSugar() {
        return (o1, o2) -> (int) (o1.getAmountSugar() - o2.getAmountSugar());  // то же самое...
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sweets sweets = (Sweets) o;
        return Double.compare(sweets.amountSugar, amountSugar) == 0 &&
                Double.compare(sweets.sweetWeight, sweetWeight) == 0 &&
                Double.compare(sweets.sweetPrice, sweetPrice) == 0 &&
                Objects.equals(name, sweets.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountSugar, sweetWeight, sweetPrice);
    }

    @Override
    public String toString() {
        return "Сладость:" + getName() + ", Содержание сахара:" + getAmountSugar() + "%" + ", вес:" + getSweetWeight() +
                ", цена:" + getSweetPrice();
    }

    @Override
    public void unpackAndValidate() {
        System.out.println("Распаковываем и проверяем сладость: " + this.toString());
    }
}


