package com.github.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements SubjectInterface {

    private final List<Observer> observers;

    public SubjectImpl() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyRegisteredUsers(int notifiedValue) {
        observers.forEach(b -> b.update(notifiedValue));
    }
}
