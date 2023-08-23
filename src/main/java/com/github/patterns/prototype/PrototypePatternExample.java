package com.github.patterns.prototype;

public class PrototypePatternExample {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("***Prototype pattern demo***");
        final BasicCar nano = new Nano("Green nano");
        final BasicCar ford = new Ford("Ford yellow");
        ford.basePrice = 88;

        BasicCar bc1 = nano.clone();
        bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price rs. " + bc1.onRoadPrice);

        bc1 = ford.clone();
        bc1.onRoadPrice = nano.basePrice + BasicCar.setAdditionalPrice();
        System.out.println("Car is: " + bc1.modelName + " and it's price rs. " + bc1.onRoadPrice);

    }
}
