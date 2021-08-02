package org.example;

class RegularPrice extends Price {

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) return 2 + (daysRented - 2) * 1.5;
        return 2;
    }
}
