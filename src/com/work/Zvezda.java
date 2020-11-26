package com.work;

import com.essences.Sweets;
import com.fabric.GiftFabric;
import com.fabric.SweetsFabric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Zvezda {

    public static void main(String[] args) throws IOException {

        GiftFabric giftFabric = new GiftFabric("ООО \"Фабрика новогодних подарков - Звезда\"");
        SweetsFabric sweetsFabric = new SweetsFabric("Фабрика Красный Октябрь");


        Double giftPrice = 0.0;

        System.out.println("Введите предельную стоимость подарка: ");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            giftPrice = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некоректную стоимость подарка");
            throw e;
        }

        for (int i = 0; i < 10; i++) {
            giftFabric.arrayNewYearGift.add(giftFabric.makeGiftByPrice(sweetsFabric, giftPrice));
        }


        System.out.println("Тестовая валидация подарка:");
        giftFabric.arrayNewYearGift.get(1).sortNewYearGiftByPrice();
        giftFabric.arrayNewYearGift.get(1).unpackAndValidate();
        List<Sweets> arraySweetsOfNewYearGift = giftFabric.arrayNewYearGift.get(1).getListOfSweets();
        System.out.println("В подарке имется конфеты:");

        for (Sweets sweet : arraySweetsOfNewYearGift) {
            System.out.println(sweet.toString());
        }

        System.out.println("Конфета с самым большим содержанием сахара: " + giftFabric.arrayNewYearGift.get(0).
                getSweetWithMaxSugar().
                toString());

    }

}

