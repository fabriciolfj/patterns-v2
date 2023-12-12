package com.github.patterns.templatemethod;

public class Sacola extends Pacote {

    @Override
    public void embrulhar() {
        System.out.println("embrulhando a sacola");
    }

    @Override
    public boolean isEnviar() {
        return false;
    }
}
