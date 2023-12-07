package com.github.patterns.observer;

public interface SubjectInterface {

    void register(final Observer observer);
    void unregister(final Observer observer);
    void notifyRegisteredUsers(int notifiedValue);
}
