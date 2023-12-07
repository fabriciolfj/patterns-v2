package com.github.patterns.visitor;

public class ConcretVisitor implements Visitor {

    @Override
    public void visit(MyClass myClass) {
        var result = myClass.getMyInt();
        System.out.println("result new value: " + (result * 2));
    }
}
