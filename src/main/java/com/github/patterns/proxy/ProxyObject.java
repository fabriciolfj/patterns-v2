package com.github.patterns.proxy;

public class ProxyObject extends Subject {

    private static ConcretObject concretObject;

    @Override
    protected void doWork() {
        if (concretObject == null) {
            concretObject = new ConcretObject();
        }

        concretObject.doWork();
    }
}
