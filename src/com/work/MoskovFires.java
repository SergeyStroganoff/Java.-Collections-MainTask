package com.work;

import com.essences.Sweets;
import com.fabric.GiftFabric;
import com.fabric.SweetsFabric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class MoskovFires {

    public static void main(String[] args) throws IOException {

        GiftFabric giftFabric = new GiftFabric("ООО \"Фабрика новогодних подарков - Московские огни\"");
        SweetsFabric sweetsFabric = new SweetsFabric("Фабрика Красный Октябрь");


        Double giftWeight = 0.0;

        System.out.println("Введите предельный вес подарков в граммах");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            giftWeight = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не корректный вес подарка");
            throw e;
        }

        for (int i = 0; i < 24; i++) {
            giftFabric.arrayNewYearGift.add(giftFabric.makeGiftByWeight(sweetsFabric, giftWeight));
        }


        System.out.println("Тестовая валидация подарка:");
        giftFabric.arrayNewYearGift.get(0).sortNewYearGiftByPrice();
        giftFabric.arrayNewYearGift.get(0).unpackAndValidate();
        List<Sweets> arraySweetsOfNewYearGift = giftFabric.arrayNewYearGift.get(0).getListOfSweets();
        System.out.println("В подарке имеются конфеты:");

        for (Sweets sweet : arraySweetsOfNewYearGift) {
            System.out.println(sweet.toString());
        }

        System.out.println("Конфета с самым большим содержанием сахара: " + giftFabric.arrayNewYearGift.get(0).
                getSweetWithMaxSugar().
                toString());

    }
}
