package com.github.patterns.flyweight;

public class SmallRobot implements Robot {

    private final String rootTypeCreated;

    public SmallRobot() {
        this.rootTypeCreated = "a small robot created";
        System.out.println(this.rootTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + color + " color");
    }
}
