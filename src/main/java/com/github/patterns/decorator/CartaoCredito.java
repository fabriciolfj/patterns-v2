package com.github.patterns.decorator;


import java.math.BigDecimal;

public interface CartaoCredito {

    void autorizar();

    BigDecimal getValue();
}
