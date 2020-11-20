package com.essences;

public class ChupaChups extends Candy {

    public static int brendTaxChupaChups;

    public ChupaChups(double sweetPrice, CandyTasteType tasteOfCandy) {
        super(sweetPrice + brendTaxChupaChups, tasteOfCandy);    // вычесления в конструкторе
    }

    @Override
    public String toString() {
        return "ChupaChups{" +
                "Вкус конфеты: " + tasteOfCandy;
    }


}
