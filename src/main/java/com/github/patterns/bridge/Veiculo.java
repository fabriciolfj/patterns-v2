package com.github.patterns.bridge;

public abstract class Veiculo {

    protected Motor motor;

    public Veiculo(Motor motor) {
        this.motor = motor;
    }

    abstract public void acelerar();
    abstract public void frear();
    abstract public void ligar();
    abstract public void desligar();
}