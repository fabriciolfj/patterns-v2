package com.github.patterns.decorator.cartao;

import java.math.BigDecimal;

public class CartaoVisa implements CartaoCredito {

    private BigDecimal value;

    public CartaoVisa(final BigDecimal value) {
        this.value = value;
    }

    @Override
    public void autorizar() {
        System.out.printf("Autorizando o valor %s%n", value);
    }

    @Override
    public BigDecimal getValue() {
        return value;
    }
}
