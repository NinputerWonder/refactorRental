package org.example;

class NewReleasePrice extends Price {

    @Override
    double getCharge(int daysRented) {
        return daysRented * 3;
    }
}
