package com.github.patterns.flyweight;

public class FixedSizeRobot implements Robot {

    private final String rootTypeCreated;

    public FixedSizeRobot() {
        this.rootTypeCreated = "a robot fixed size created";
        System.out.println(this.rootTypeCreated);
    }

    @Override
    public void showMe(String color) {
        System.out.println(" with " + " blue (default) color");
    }
}
