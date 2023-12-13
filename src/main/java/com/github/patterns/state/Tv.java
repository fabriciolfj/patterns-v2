package com.github.patterns.state;

public class Tv {

    private State current;

    public Tv() {
        this.current = new Liga();
    }

    public void pressButton() {
        this.current.execute(this);
    }

    public void updateState(final State state) {
        this.current = state;
    }
}
