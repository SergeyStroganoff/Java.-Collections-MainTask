package com.essences;

public enum ChocolateType {

    MILK_CHOCOLATE("Молочный шоколад"),
    BLACK_CHOCOLATE("Черный шоколад");

    public String ChocolateTypeName;

    ChocolateType(String chocolateTypeName) {
        ChocolateTypeName = chocolateTypeName;
    }
}
