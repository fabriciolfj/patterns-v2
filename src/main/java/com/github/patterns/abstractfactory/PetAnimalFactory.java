package com.github.patterns.abstractfactory;

public class PetAnimalFactory implements AnimalFactory {

    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Tiger createTiger() {
        return new PetTiger();
    }
}
