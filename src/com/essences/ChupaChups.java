package com.essences;

public class ChupaChups extends Candy {

    private static int brendTaxChupaChups;

    public ChupaChups(double sweetPrice, CandyTasteType tasteOfCandy) {
        super(sweetPrice + brendTaxChupaChups, tasteOfCandy);    // вычесления в конструкторе
    }

    public static void setBrendTaxChupaChups(int brendTaxChupaChups) {
        ChupaChups.brendTaxChupaChups = brendTaxChupaChups;
    }

    @Override
    public String toString() {
        return  "Чупа чупс" + ", вкус:" + this.tasteOfCandy.CandyTasteTypeName + ", размер:" + this.candySizeType.CandySizeTypeWeightName +
              ", содержание сахара:" + amountSugar + ", вес:" + sweetWeight + ", стоимость:" + sweetPrice;
    }
}


 //return "Чупа чупс" + ", вкус:" + this.tasteOfCandy.CandyTasteTypeName + ", размер:" + this.candySizeType.CandySizeTypeWeightName +
 //        ", содержание сахара:" + amountSugar + ", вес:" + sweetWeight + ", стоимость:" + sweetPrice;