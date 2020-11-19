package com.essences;

public enum CandySizeType {

    SMALL(1.0),
    MEDIUM(2.0),
    BIG(3.0);


    public double CandySizeTypeWeight;



    CandySizeType(double CandySizeTypeWeight) {

        this.CandySizeTypeWeight = CandySizeTypeWeight;

    }


}
