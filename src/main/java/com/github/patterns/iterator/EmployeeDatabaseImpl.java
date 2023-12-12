package com.github.patterns.iterator;

import java.util.LinkedList;

public class EmployeeDatabaseImpl implements Database {

    private LinkedList<Employee> employees;

    public EmployeeDatabaseImpl() {
        this.employees = new LinkedList<>();
        this.employees.add(new Employee("fabricio", 39));
        this.employees.add(new Employee("jessica", 23));
        this.employees.add(new Employee("roberto", 44));
        this.employees.add(new Employee("suzana", 32));
        this.employees.add(new Employee("lucas", 35));
        this.employees.add(new Employee("carina", 54));
        this.employees.add(new Employee("donizete", 32));
    }

    public LinkedList<Employee> getEmployees() {
        return employees;
    }
}
