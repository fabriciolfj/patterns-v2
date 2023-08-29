package com.github.patterns.concurrencystructure.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public record Order(
        @JsonIgnore
        String name, String product, int quantity, BigDecimal total) {
}
