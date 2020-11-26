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
import java.util.Objects;

public class NewYearGift implements Validate {

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


    public void sortNewYearGiftByPrice() {
        listOfSweets.sort(Sweets.comparatorBySweetPrice());
    }

    public void sortNewYearGiftBySugar() {
        listOfSweets.sort(Sweets.comparatorBySweetSugar());
    }


    public Sweets getSweetWithMaxSugar() {
        listOfSweets.sort(Sweets.comparatorBySweetSugar());
        return listOfSweets.get(listOfSweets.size() - 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewYearGift that = (NewYearGift) o;
        return Double.compare(that.giftWeight, giftWeight) == 0 &&
                giftPrice == that.giftPrice &&
                countOfSweets == that.countOfSweets &&
                Objects.equals(listOfSweets, that.listOfSweets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(listOfSweets, giftWeight, giftPrice, countOfSweets);
    }

    @Override
    public String toString() {
        return "Новогодний подарок." + " Общий вес: " + giftWeight +
                ", Стоимость подарка: " + giftPrice + ", колличество сладостей: " + countOfSweets;
    }

    @Override
    public void unpackAndValidate() {
        System.out.println("Распаковываем и проверяем подарок: " + newYearGift.toString());
    }
}
