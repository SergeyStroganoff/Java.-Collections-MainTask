package com.essences;

public class Candy extends Sweets {

    CandyTasteType tasteOfCandy;
    CandySizeType candySizeType;

    private static double amountCandySugarPercent;
    private static double indexWeightCandy;

    public Candy(String name, double sweetprice, CandyTasteType tasteOfCandy, CandySizeType candySizeType) { // как осуществить расчеты не в конструкторе

        super(name, candySizeType.CandySizeTypeWeight * indexWeightCandy * amountCandySugarPercent / 100, candySizeType.CandySizeTypeWeight * indexWeightCandy, sweetprice);  // как установить проверку amountCandySugarPercent ?
        this.tasteOfCandy = tasteOfCandy;
        this.candySizeType = candySizeType;
    }

    Candy(double sweetPrice, CandyTasteType tasteOfCandy) {
        super("Chupa Chups", 95, 12, sweetPrice);
        this.tasteOfCandy = tasteOfCandy;
    }

    public static void setAmountCandySugarPercent(double amountCandySugarPercent) {

        if (amountCandySugarPercent <= 0 && amountCandySugarPercent > 100) Candy.amountCandySugarPercent = 99;
        Candy.amountCandySugarPercent = amountCandySugarPercent;
    }

    public static void setIndexWeightCandy(double indexWeightCandy) {
        if (indexWeightCandy <= 0) Candy.indexWeightCandy = 1;
        Candy.indexWeightCandy = indexWeightCandy;
    }


}
