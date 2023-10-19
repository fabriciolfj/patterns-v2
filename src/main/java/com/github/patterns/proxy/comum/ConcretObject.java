package com.github.patterns.proxy.comum;

public class ConcretObject extends Subject {


    @Override
    protected void doWork() {
        System.out.println("concret execute");
    }
}
