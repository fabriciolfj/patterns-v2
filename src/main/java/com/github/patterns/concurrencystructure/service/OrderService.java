package com.github.patterns.concurrencystructure.service;

import com.github.patterns.concurrencystructure.dto.Order;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class OrderService {

    private static final List<Order> orders =
            List.of(new Order("fabricio", "arroz", 2, BigDecimal.TEN),
                    new Order("lucas", "feijao", 1, BigDecimal.valueOf(29.9)));

    public Order findByCode(final String name) {
        return orders
                .stream()
                .filter(p -> p.name().equalsIgnoreCase(name))
                .findFirst()
                .orElseThrow();
    }
}
