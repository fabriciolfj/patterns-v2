package com.github.patterns.templatemethod;

public class Main {

    public static void main(String[] args) {
        var sacola = new Sacola();
        var caixa = new Caixa();

        sacola.execute();

        System.out.println("===============");

        caixa.execute();
    }
}
