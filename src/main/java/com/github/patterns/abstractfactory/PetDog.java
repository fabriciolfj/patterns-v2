package com.github.patterns.abstractfactory;

public class PetDog implements Dog {

    @Override
    public void speak() {
        System.out.println("pet dog says softy. Bom-wow");
    }

    @Override
    public void preferredAction() {
        System.out.println("pet dogs prefer to stay at home");
    }
}
