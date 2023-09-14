package com.github.patterns.abstractfactory;

public class PetTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("pet tiger says softly: halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("pet tigers play in the animal circus");
    }
}
