package com.github.patterns.visitor;

public class MyClass implements OriginalInterface {

    private final int myInt;

    public MyClass() {
        this.myInt = 5;
    }

    @Override
    public void acceptVisitor(final Visitor visitor) {
        visitor.visit(this);
    }

    public int getMyInt() {
        return myInt;
    }
}
