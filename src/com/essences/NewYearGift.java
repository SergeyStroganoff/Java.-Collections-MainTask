package com.essences;


/*Новогодний подарок
        Определить иерархию конфет и прочих сладостей.
        Создать несколько объектов-конфет.
        Собрать детский подарок с определением его веса.
        Провести сортировку конфет в подарке на основе одного из параметров.
        Найти конфету в подарке, соответствующую заданному диапазону содержания сахара.

*/


import java.util.ArrayList;
import java.util.List;

public class NewYearGift {

    private int giftWeight;
    List<Sweets> listOfSweets = new ArrayList<>();

    public NewYearGift(int giftWeight) {
        this.giftWeight = giftWeight;
    }

    public int getGiftWeight() {
        return giftWeight;
    }

    public void setGiftWeight(int giftWeight) {
        this.giftWeight = giftWeight;
    }
}
