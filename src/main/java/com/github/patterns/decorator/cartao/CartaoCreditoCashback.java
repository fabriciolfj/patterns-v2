package com.github.patterns.decorator.cartao;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CartaoCreditoCashback extends CartaoCreditoDecoratorAbstract {

    public CartaoCreditoCashback(final CartaoCredito cartaoCredito) {
        super(cartaoCredito);
    }

    @Override
    public void autorizar() {
        this.cartaoCredito.autorizar();
        var result = this.getValue().multiply(new BigDecimal(0.89))
                .setScale(2, RoundingMode.HALF_UP);
        System.out.printf("valor total cashback %s%n", result);
    }
}
