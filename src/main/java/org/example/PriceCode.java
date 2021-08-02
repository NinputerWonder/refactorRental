package org.example;

import java.util.function.Supplier;

public enum PriceCode {
    REGULAR(0, () -> new RegularPrice()),
    NEW_RELEASE(1, () -> new NewReleasePrice()),
    CHILDRENDS(2, () -> new ChildrenPrice());

    private int code;
    private Supplier<Price> supplier;

    PriceCode(int code, Supplier<Price> supplier) {

        this.code = code;
        this.supplier = supplier;
    }

    public int getCode() {
        return code;
    }

    public Price create() {
        return this.supplier.get();
    }
}
