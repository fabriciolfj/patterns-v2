package com.github.patterns.proxy.comum;

public class Simulation {

    public static void main(String[] args) {
        Subject proxy = new ProxyObject();
        proxy.doWork();
    }
}
