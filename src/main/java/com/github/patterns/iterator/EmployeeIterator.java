package com.github.patterns.iterator;

import java.util.Iterator;
import java.util.List;

public class EmployeeIterator implements Iterator<Employee> {

    private int index;
    private List<Employee> employees;

    public EmployeeIterator(final List<Employee> employees) {
        this.employees = employees;
        this.index = 0;
    }

    public Employee first() {
        index = 0;
        return employees.get(0);
    }

    public Employee current() {
        return employees.get(index);
    }

    @Override
    public boolean hasNext() {
        return employees.size() > index;
    }

    @Override
    public Employee next() {
        return employees.get(index++);
    }
}
