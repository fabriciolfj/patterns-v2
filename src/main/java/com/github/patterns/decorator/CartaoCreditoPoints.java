package com.github.patterns.decorator;

import java.math.BigDecimal;

public class CartaoCreditoPoints extends CartaoCreditoDecoratorAbstract {


    public CartaoCreditoPoints(CartaoCredito cartaoCredito) {
        super(cartaoCredito);
    }

    @Override
    public void autorizar() {
        this.cartaoCredito.autorizar();

        var result = this.getValue().divide(BigDecimal.TWO);
        System.out.printf("valor dos pontos %s%n", result);
    }
}
