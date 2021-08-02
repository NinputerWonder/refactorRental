package org.example;

import java.util.Arrays;

public class Movie {
    private String _title;
    private PriceCode _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
       setPriceCode(priceCode);
    }

    public void setPriceCode(int arg) {
        _priceCode = Arrays.stream(PriceCode.values()).filter(p -> p.getCode() == arg).findFirst().orElseThrow(() -> new IllegalArgumentException("error arg"));
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int daysRented) {
        return _priceCode.create().getCharge(daysRented);
    }

    int getFrequnetRenterPoints(int daysRented) {
        if ((_priceCode == PriceCode.NEW_RELEASE) && daysRented > 1)
            return 2;
        return 1;
    }
}

