package com.github.patterns.decorator.cartao;


import java.math.BigDecimal;

public interface CartaoCredito {

    void autorizar();

    BigDecimal getValue();
}
