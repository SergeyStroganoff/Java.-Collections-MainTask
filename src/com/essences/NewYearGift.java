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

    public static NewYearGift newYearGift;

    private List<Sweets> listOfSweets = new ArrayList<>();
    private double giftWeight;
    private int giftPrice;
    private int countOfSweets;


    private NewYearGift() {
    }

    public static NewYearGift createNewYearGift(List<Sweets> listOfSweets) { // перенести в конструктор ?

        if (listOfSweets.isEmpty()) {
            return null;
        }  // maybe trow new exception ?
        newYearGift = new NewYearGift();
        newYearGift.listOfSweets = listOfSweets;
        newYearGift.countOfSweets = newYearGift.listOfSweets.size();
        for (Sweets currentSweet : newYearGift.listOfSweets) {
            newYearGift.giftWeight += currentSweet.sweetWeight;
            newYearGift.giftPrice += currentSweet.sweetPrice;
        }

        return newYearGift;
    }

    public int getCountOfSweets() {
        return countOfSweets;
    }

    public double getGiftWeight() {
        return giftWeight;
    }

    public int getGiftPrice() {
        return giftPrice;
    }

    public void setGiftPrice(int giftPrice) {
        this.giftPrice = giftPrice;
    }

    public List<Sweets> getListOfSweets() {
        return listOfSweets;
    }


}
