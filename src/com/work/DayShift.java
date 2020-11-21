package com.work;

import com.fabric.GiftFabric;
import com.fabric.SweetsFabric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DayShift {

    public static void main(String[] args) throws IOException {

        GiftFabric giftFabric = new GiftFabric("ООО \"Фабрика новогодних подарков\"");
        SweetsFabric sweetsFabric = new SweetsFabric("Фабрика Красный Октябрь");


        Double giftWeight = 0.0;

        System.out.println("Дневная смена приступает к работе");
        System.out.println("Введите предельный вес подарков в граммах");

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            giftWeight = Double.parseDouble(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели некоректный вес подарка");
            throw e;
        }


        for (int i = 0; i < 24; i++) {

            giftFabric.arrayNewYearGift.add(giftFabric.makeGiftByWeight(sweetsFabric, giftWeight));

        }


        System.out.println("Вес тествого подарка составил:" + giftFabric.arrayNewYearGift.get(0).getGiftWeight());
        System.out.println("Цена подарка составила:" + giftFabric.arrayNewYearGift.get(0).getGiftPrice());

    }
}
