package com.fabric;

import com.essences.*;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SweetsFabric {

    public final String fabricName;

    static List<? extends Candy> candyList = Arrays.asList(
            new Candy("Лемонный сад", 2.45, CandyTasteType.LEMON, CandySizeType.MEDIUM),
            new Candy("Лемонный сад", 2.75, CandyTasteType.LEMON, CandySizeType.BIG),
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
            new ChupaChups(6, CandyTasteType.WATERMELON)
    );

    static List<? extends ChocolateBar> chocolateSweetList = Arrays.asList(
            new ChocolateBar("Аленка", 35.1, 100, 48.5, ChocolateType.MILK_CHOCOLATE, 33),
            new ChocolateBar("Бабаевский горький", 27.5, 100, 42, ChocolateType.BLACK_CHOCOLATE, 56),
            new ChocolateBar("Коркунов столичный", 29.5, 100, 44, ChocolateType.BLACK_CHOCOLATE, 52),
            new ChocolateSweet("Шоколадный восторг", 39, 14, 21, ChocolateType.MILK_CHOCOLATE, 30, "Ореховая паста"),
            new ChocolateSweet("Сокровища Кремля", 30, 16, 24.5, ChocolateType.MILK_CHOCOLATE, 38, "Зефир"),
            new ChocolateSweet("Черный барон", 25, 10.5, 17.8, ChocolateType.BLACK_CHOCOLATE, 58, "Капучино"),
            new ChocolateSweet("Шоко-Моко", 37, 18.5, 19.5, ChocolateType.BLACK_CHOCOLATE, 48, "Кофейный мусс")
    );

    public SweetsFabric(String fabricName) {
        this.fabricName = fabricName;
    }

    public Sweets createSweet(SweetType type) {

        Random random = new Random();
        Sweets sweet = null;

        switch (type) {
            case CANDY:
                sweet = candyList.get(random.nextInt(candyList.size()));
                break;
            case CHOCOLATE_BAR:
                sweet = chocolateSweetList.get(random.nextInt(chocolateSweetList.size()));
                break;
        }
        return sweet;
    }
}



