package com.fabric;

import com.essences.NewYearGift;
import com.essences.SweetType;
import com.essences.Sweets;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GiftFabric {

    public final String GiftFabricName;

    public GiftFabric(String giftFabricName) {
        GiftFabricName = giftFabricName;
    }

    public List<NewYearGift> arrayNewYearGift = new ArrayList<>();

    public NewYearGift makeGiftByWeight(SweetsFabric sweetsFabric, double giftWeight) {   // статический метод или создвать экземляр фабрики
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


}
