package com.fabric;

import com.essences.NewYearGift;
import com.essences.SweetType;
import com.essences.Sweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GiftFabric {

    public final String GiftFabricName;
    public List<NewYearGift> arrayNewYearGift = new ArrayList<>();

    public GiftFabric(String giftFabricName) {
        GiftFabricName = giftFabricName;
    }

    public NewYearGift makeGiftByWeight(SweetsFabric sweetsFabric, double giftWeight) {   // статический метод или создвать экземляр фабрики

        if (giftWeight <= 0) return null; // что лучьше, возвращать null, exception, или устанавливать свой вес. ?
        List<Sweets> tempListSweets = new ArrayList<>();
        Random randomSweet = new Random();
        double weight = 0;

        while (weight < giftWeight) {
            Sweets sweet = sweetsFabric.createSweet(SweetType.values()[randomSweet.nextInt(SweetType.values().length)]);
            weight += sweet.getSweetWeight();
            if (weight < giftWeight) {
                tempListSweets.add(sweet);
            }
        }
        return NewYearGift.createNewYearGift(tempListSweets);
    }


    public NewYearGift makeGiftByPrice(SweetsFabric sweetsFabric, double giftPrice) {

        if (giftPrice <= 0) return null; // что лучьше, возвращать null, exception, или устанавливать свой вес. ?
        List<Sweets> tempListSweets = new ArrayList<>();
        Random randomSweet = new Random();
        double currentSweetPrice = 0;

        while (currentSweetPrice < giftPrice) {
            Sweets sweet = sweetsFabric.createSweet(SweetType.values()[randomSweet.nextInt(SweetType.values().length)]);
            currentSweetPrice += sweet.getSweetPrice();
            if (currentSweetPrice < giftPrice) {
                tempListSweets.add(sweet);
            }
        }
        return NewYearGift.createNewYearGift(tempListSweets);
    }
}


