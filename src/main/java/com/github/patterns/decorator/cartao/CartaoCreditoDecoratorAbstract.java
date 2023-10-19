package com.github.patterns.decorator.cartao;

import java.math.BigDecimal;

public abstract class CartaoCreditoDecoratorAbstract {

    protected CartaoCredito cartaoCredito;

    protected abstract void autorizar();

    public CartaoCreditoDecoratorAbstract(final CartaoCredito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public BigDecimal getValue() {
        return this.cartaoCredito.getValue();
    }
}
