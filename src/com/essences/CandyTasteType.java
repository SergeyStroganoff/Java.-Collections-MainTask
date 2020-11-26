package com.essences;

public enum CandyTasteType {
    LEMON("Лемонный"),
    MINTY("Мятный"),
    WATERMELON("Арбуз"),
    FRUIT_MIX("Фруктовый миикс"),
    Milk("Сливочный"),
    CCOFEMILK("Кофе с молоком");

    public String CandyTasteTypeName;

    CandyTasteType(String candyTasteTypeName) {
        CandyTasteTypeName = candyTasteTypeName;
    }
}
