package com.github.patterns.mediator;

import java.math.BigDecimal;

public class Risk {

    public BigDecimal calculateLimit(final BigDecimal value, final Integer score) {
        if (score == 0) {
            return BigDecimal.ZERO;
        }

        if (score > 5) {
            return value;
        }

        return value.multiply(BigDecimal.valueOf(0.4));
    }
}
