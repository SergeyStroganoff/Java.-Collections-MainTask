package com.essences;

import java.util.Objects;

public class Candy extends Sweets {

    CandyTasteType tasteOfCandy;
    CandySizeType candySizeType;

    public static double indexWeightCandy;

    public Candy(String name, double sweetprice, CandyTasteType tasteOfCandy, CandySizeType candySizeType) { // как осуществить расчеты не в конструкторе

        super(name, 98, candySizeType.CandySizeTypeWeight * indexWeightCandy, sweetprice);  // как установить проверку amountCandySugarPercent ?
        this.tasteOfCandy = tasteOfCandy;
        this.candySizeType = candySizeType;
    }

    Candy(double sweetPrice, CandyTasteType tasteOfCandy) {
        super("Chupa Chups", 95, 12, sweetPrice);
        this.tasteOfCandy = tasteOfCandy;
        this.candySizeType = CandySizeType.MEDIUM;
    }


    public static void setIndexWeightCandy(double indexWeightCandy) {
        if (indexWeightCandy <= 0) Candy.indexWeightCandy = 1;
        Candy.indexWeightCandy = indexWeightCandy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Candy candy = (Candy) o;
        return tasteOfCandy == candy.tasteOfCandy &&
                candySizeType == candy.candySizeType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tasteOfCandy, candySizeType);
    }

    @Override
    public String toString() {
        return "Леденец: " + name + ", Вкус: " + tasteOfCandy.CandyTasteTypeName + ", размер леденца: " + candySizeType.CandySizeTypeWeightName +
                ", содержание сахара: " + amountSugar + "%" + ", вес леденца: " + sweetWeight +
                ", цена леденца:" + sweetPrice;
    }
}
