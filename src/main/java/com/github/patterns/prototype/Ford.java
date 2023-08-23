package com.github.patterns.prototype;

public class Ford extends BasicCar {

    public int basePrice = 99999;

    public Ford(final String m) {
        modelName = m;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
}
