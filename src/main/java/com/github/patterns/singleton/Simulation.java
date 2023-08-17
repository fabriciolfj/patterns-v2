package com.github.patterns.singleton;

public class Simulation {

    public static void main(String[] args) {
        var cap1 = CaptainSingleton.getCaptain();
        var cap2 = CaptainSingleton.getCaptain();

        if (cap1 == cap2) {
            System.out.println("equals");
        }
    }
}
