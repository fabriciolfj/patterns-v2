package com.github.patterns.concurrencystructure.controller;

import com.github.patterns.concurrencystructure.dto.OrderPerson;
import com.github.patterns.concurrencystructure.service.OrderService;
import com.github.patterns.concurrencystructure.service.PersonService;
//import jdk.incubator.concurrent.StructuredTaskScope;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ExecutionException;

/*
@RequestMapping("/api/v1/orders")
@RestController
public class OrderPersonController {

    @Autowired
    private PersonService personService;

    @Autowired
    private OrderService orderService;

    @GetMapping("/{name}")
    public OrderPerson find(@PathVariable("name") final String name) throws ExecutionException, InterruptedException {
        try (var scope = new StructuredTaskScope.ShutdownOnFailure()) {
            var user = scope.fork(() -> personService.findByName(name));
            var order = scope.fork(() -> orderService.findByCode(name));

            scope.join();
            scope.throwIfFailed();

            return new OrderPerson(user.resultNow(), order.resultNow());
        }
    }
}*/

