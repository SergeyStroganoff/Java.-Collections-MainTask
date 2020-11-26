package com.essences;

public enum CandySizeType {

    SMALL(1.0, "Маленький"),
    MEDIUM(2.0, "Средний"),
    BIG(3.0, "Большой");

    public double CandySizeTypeWeight;
    public String CandySizeTypeWeightName;

    CandySizeType(double candySizeTypeWeight, String candySizeTypeWeightName) {
        CandySizeTypeWeight = candySizeTypeWeight;
        CandySizeTypeWeightName = candySizeTypeWeightName;
    }
}
