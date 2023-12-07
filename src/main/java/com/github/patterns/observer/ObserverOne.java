package com.github.patterns.observer;

public class ObserverOne implements Observer {

    private final String name;

    public ObserverOne(String name) {
        this.name = name;
    }

    @Override
    public void update(int updateValue) {
        System.out.println(getName() + " has received an alert, value: " + updateValue);
    }

    public String getName() {
        return name;
    }
}
