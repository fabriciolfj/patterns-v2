package com.github.patterns.mediator;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        var mediator = new ConcreteMediator();

        var loan = new Loan(mediator, BigDecimal.valueOf(100));
        var customer = new Customer("Fabricio");
        var risk = new Risk();

        loan.calculate(risk, customer);
    }
}
