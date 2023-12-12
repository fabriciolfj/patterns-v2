package com.github.patterns.iterator;

public class Main {

    public static void main(String[] args) {
        var base = new EmployeeDatabaseImpl();
        var iterator = new EmployeeIterator(base.getEmployees());

        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("============ current");
        System.out.println(iterator.current());

        System.out.println(iterator.next());
        System.out.println("next?" + iterator.hasNext());

        System.out.println(iterator.next());
        System.out.println("next?" + iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println("next?" + iterator.hasNext()); // da erro


    }
}
