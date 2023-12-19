package com.github.patterns.mediator;

import java.math.BigDecimal;

public class Loan {

    private final Mediator mediator;
    private final BigDecimal value;

    public Loan(final Mediator mediator, final BigDecimal value) {
        this.mediator = mediator;
        this.value = value;
    }

    public void calculate(final Risk risk, final Customer customer) {
        this.mediator.execute(risk, customer, this);
    }

    public BigDecimal getValue() {
        return value;
    }
}
