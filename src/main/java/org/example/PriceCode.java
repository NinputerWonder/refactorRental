package org.example;

public enum PriceCode {
    REGULAR(0), NEW_RELEASE(1), CHILDRENDS(2);

    private int code;

    PriceCode(int code) {

        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
