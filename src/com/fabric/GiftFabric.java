package com.fabric;

import com.essences.NewYearGift;

public class GiftFabric {

    public static void main(String[] args) {
        // write your code here

        NewYearGift present = NewYearGift.makeGiftByWeight(1000);

        System.out.println("Итоговый подарок"+ present.toString());

    }

}
