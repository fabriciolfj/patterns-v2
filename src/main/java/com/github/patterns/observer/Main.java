package com.github.patterns.observer;

public class Main {

    public static void main(String[] args) {
        var observerOne = new ObserverOne("Fabricio");
        var observerTwo = new ObserverTwo("Lucas");

        var subject = new SubjectImpl();
        subject.register(observerOne);
        subject.register(observerTwo);

        subject.notifyRegisteredUsers(10);
    }
}
