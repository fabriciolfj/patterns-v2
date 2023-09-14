package com.github.patterns.proxy;

public class Simulation {

    public static void main(String[] args) {
        Subject proxy = new ProxyObject();
        proxy.doWork();
    }
}
