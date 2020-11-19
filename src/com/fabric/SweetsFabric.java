package com.fabric;

import com.essences.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SweetsFabric {

    static List<? extends Candy> candyList = Arrays.asList(
            new Candy("Лемонный сад", 2.45, CandyTasteType.LIMON, CandySizeType.MEDIUM),
            new Candy("Лемонный сад", 2.75, CandyTasteType.LIMON, CandySizeType.BIG),
            new Candy("Фруктовый взрыв", 4.05, CandyTasteType.FRUIT_MIX, CandySizeType.SMALL),
            new Candy("Фруктовый взрыв", 5.25, CandyTasteType.FRUIT_MIX, CandySizeType.MEDIUM),
            new Candy("Фруктовый взрыв", 6.75, CandyTasteType.FRUIT_MIX, CandySizeType.BIG),
            new Candy("Мятная свежесть", 3.30, CandyTasteType.MINTY, CandySizeType.SMALL),
            new Candy("Мятная свежесть", 3.30, CandyTasteType.MINTY, CandySizeType.MEDIUM),
            new Candy("Мятная свежесть", 3.30, CandyTasteType.MINTY, CandySizeType.BIG),
            new Candy("Сливочная", 3.30, CandyTasteType.Milk, CandySizeType.MEDIUM),
            new Candy("Сливочная", 3.30, CandyTasteType.Milk, CandySizeType.MEDIUM),
            new ChupaChups(6.5, CandyTasteType.CCOFEMILK),
            new ChupaChups(6.3, CandyTasteType.Milk),
            new ChupaChups(6, CandyTasteType.WATERMELON),

            );

    static List<ChocolateSweet> chocolateSweetList = Arrays.asList(

    );

    public Sweets createSweet(SweetType type) {

        Random random = new Random();
        Sweets sweet = null;


        switch (type) {
            case CANDY:
                sweet = candyList.get(random.nextInt(candyList.size()));
                break;
            case CHOCOLATE_BAR:
                sweet = candyList.get(random.nextInt(candyList.size()));
                break;
            case CHUPACHUPS:
                sweet = candyList.get(random.nextInt(candyList.size()));
                break;
            case CHOCOLATE_SWEET:
                sweet = candyList.get(random.nextInt(chocolateSweetList.size()));
                break;
        }
        return sweet;
    }
}



