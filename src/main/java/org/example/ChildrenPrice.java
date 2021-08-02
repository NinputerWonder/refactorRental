package org.example;

class ChildrenPrice extends Price {

    @Override
    double getCharge(int daysRented) {
        if (daysRented > 3) return 1.5 + (daysRented - 3) * 1.5;
        return 1.5;
    }
}
