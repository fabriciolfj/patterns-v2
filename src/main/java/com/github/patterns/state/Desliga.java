package com.github.patterns.state;

public class Desliga implements State {

    @Override
    public void execute(final Tv tv) {
        System.out.println("Desligando a tv");
        tv.updateState(new Liga());
    }
}
