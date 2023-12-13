package com.github.patterns.memento;

import java.util.Stack;

public class Memento {

    private Stack<Employee> stack = new Stack<>();

    public void push(final Employee employee) {
        stack.push(employee.clone());
    }

    public Employee pop() {
        return stack.pop();
    }

}
