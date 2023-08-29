package com.github.patterns.concurrencystructure.service;

import com.github.patterns.concurrencystructure.dto.Person;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private static final List<Person> persons =
            List.of(new Person("fabricio", "01"), new Person("lucas", "02"));

    public Person findByName(final String name) {
        return persons.stream().filter(p -> p.name().equalsIgnoreCase(name))
                .findAny()
                .orElseThrow();
    }
}
