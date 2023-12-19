package com.github.patterns.mediator;

import java.util.Random;

public class Customer {

    private final Random random = new Random();

    private String name;
    private Integer score;

    public Customer(final String name) {
        this.name = name;
        this.score = random.nextInt(0, 10);
    }

    public String getName() {
        return name;
    }

    public Integer getScore() {
        return score;
    }
}
