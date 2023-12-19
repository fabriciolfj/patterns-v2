package com.github.patterns.mediator;

import java.math.BigDecimal;

public class ConcreteMediator implements Mediator {

    @Override
    public void execute(final Risk risk, final Customer customer, final Loan loan) {
        final var value = risk.calculateLimit(loan.getValue(), customer.getScore());

        if (value.compareTo(BigDecimal.ZERO) == 0) {
            throw new IllegalArgumentException("value zero");
        }

        System.out.println("value calculated " + value);
    }
}
