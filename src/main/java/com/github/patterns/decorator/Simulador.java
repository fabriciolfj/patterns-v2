package com.github.patterns.decorator;

import java.math.BigDecimal;

public class Simulador {

    public static void main(String[] args) {
        var cartao = new CartaoVisa(new BigDecimal("78.00"));

        var cashback = new CartaoCreditoCashback(cartao);
        cashback.autorizar();

        var pontos = new CartaoCreditoPoints(cartao);
        pontos.autorizar();
    }
}
