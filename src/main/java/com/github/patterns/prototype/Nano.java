package com.github.patterns.prototype;

public class Nano extends BasicCar {

    public int basePrice = 10000;

    public Nano(final String m) {
        modelName = m;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (Nano) super.clone();
    }
}
