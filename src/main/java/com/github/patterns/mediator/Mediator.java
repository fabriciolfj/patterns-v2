package com.github.patterns.mediator;

public interface Mediator {

    void execute(final Risk risk, final Customer customer, final Loan loan);
}
