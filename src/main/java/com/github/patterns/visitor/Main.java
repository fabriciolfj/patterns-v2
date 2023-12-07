package com.github.patterns.visitor;

public class Main {

    public static void main(String[] args) {
        var myClass = new MyClass();
        var visitor = new ConcretVisitor();

        myClass.acceptVisitor(visitor);
    }
}
