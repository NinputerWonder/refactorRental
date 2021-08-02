package org.example;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private Price _price;
    private PriceCode _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
       setPriceCode(priceCode);
    }

    public int getPriceCode() {
        return _priceCode.getCode();
    }

    public void setPriceCode(int arg) {
        switch (arg) {
            case CHILDRENS:
                _price = new ChildrenPrice();
                _priceCode = PriceCode.CHILDRENDS;
                break;
            case REGULAR:
                _price = new RegularPrice();
                _priceCode = PriceCode.REGULAR;
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                _priceCode = PriceCode.NEW_RELEASE;
                break;
            default:
                throw new IllegalArgumentException("error arg");
        }
    }

    public String getTitle() {
        return _title;
    }

    double getCharge(int daysRented) {
        return _price.getCharge(daysRented);
    }

    int getFrequnetRenterPoints(int daysRented) {
        if ((getPriceCode() == NEW_RELEASE) && daysRented > 1)
            return 2;
        return 1;
    }
}

