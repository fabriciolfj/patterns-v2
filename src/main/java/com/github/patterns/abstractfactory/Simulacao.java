package com.github.patterns.abstractfactory;

public class Simulacao {

    public static void main(String[] args) {
        var factory = new PetAnimalFactory();
        var result = factory.createDog();

        result.preferredAction();
        result.speak();
    }
}
