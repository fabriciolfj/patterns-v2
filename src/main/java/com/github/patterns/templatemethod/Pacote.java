package com.github.patterns.templatemethod;

public abstract class Pacote {

    public final void execute() {
        stepOne();
        embrulhar();

        if (isEnviar()) {
            postar();
        }
    }

    public void stepOne() {
        System.out.println("inserir o item");
    }

    public boolean isEnviar() {
        return true;
    }

    public void postar() {
        System.out.println("postando nos correios");
    }

    public abstract void embrulhar();
}
