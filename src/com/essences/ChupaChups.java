package com.essences;

public class ChupaChups extends Candy {

    public static int brendTaxChupaChups;

    public ChupaChups(double sweetPrice, CandyTasteType tasteOfCandy) {
        super(sweetPrice + brendTaxChupaChups, tasteOfCandy);
    }
}
