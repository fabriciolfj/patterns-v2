package com.github.patterns.state;

public class Liga implements State {

    @Override
    public void execute(final Tv tv) {
        System.out.println("ligando a tv");
        tv.updateState(new Desliga());
    }
}
