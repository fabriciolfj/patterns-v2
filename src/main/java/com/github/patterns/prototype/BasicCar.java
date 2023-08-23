package com.github.patterns.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
    public String modelName;
    public int basePrice, onRoadPrice;

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public static int setAdditionalPrice() {
        int price = 0;
        final Random r = new Random();
        int p = r.nextInt(10000);
        price = p;
        return price;
    }

    @Override
    protected BasicCar clone() throws CloneNotSupportedException {
        return (BasicCar) super.clone();
    }
}
