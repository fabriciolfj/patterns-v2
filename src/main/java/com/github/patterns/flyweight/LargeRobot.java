package com.github.patterns.flyweight;

public class LargeRobot implements Robot {

    private final String rootTypeCreated;

    public LargeRobot() {
        this.rootTypeCreated = "a large robot created";
        System.out.println(this.rootTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
