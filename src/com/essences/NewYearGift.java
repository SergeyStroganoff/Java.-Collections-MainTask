package com.essences;


/*Новогодний подарок
        Определить иерархию конфет и прочих сладостей.
        Создать несколько объектов-конфет.
        Собрать детский подарок с определением его веса.
        Провести сортировку конфет в подарке на основе одного из параметров.
        Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.

*/


import com.fabric.SweetsFabric;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NewYearGift {

    List<Sweets> listOfSweets = new ArrayList<>();
    private int giftWeight;
    private int giftPrice;
    private int countOfSweets;

    private NewYearGift() {
    }

    public static NewYearGift makeGiftByWeight(double giftWeight) {
        NewYearGift newYearGift = new NewYearGift();
        Random random = new Random();
        double weight = 0;

        SweetsFabric sweetsFabric = new SweetsFabric();
        while (weight < giftWeight) {

            newYearGift.listOfSweets.add(sweetsFabric.createSweet(SweetType.values()[random.nextInt(SweetType.values().length)]));
            newYearGift.countOfSweets++;
            weight += newYearGift.listOfSweets.get(newYearGift.countOfSweets - 1).sweetWeight;

        }
        return newYearGift;

    }


    public int getGiftWeight() {
        return giftWeight;
    }

    public void setGiftWeight(int giftWeight) {
        this.giftWeight = giftWeight;
    }

    public int getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(int giftPrice) {
        this.giftPrice = giftPrice;
    }
}
