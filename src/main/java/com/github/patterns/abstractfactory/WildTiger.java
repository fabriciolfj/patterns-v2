package com.github.patterns.abstractfactory;

public class WildTiger implements Tiger {

    @Override
    public void speak() {
        System.out.println("wild tiger says loudly: halum");
    }

    @Override
    public void preferredAction() {
        System.out.println("wild tigers prefer hunting in jungles");
    }
}
