package com.github.patterns.abstractfactory;

public class WildDog implements Dog {

    @Override
    public void speak() {
        System.out.println("wild dog says loudly: Bow-wow.");
    }

    @Override
    public void preferredAction() {
        System.out.println("wild dogs prefer to roam freely in jungles");
    }
}
