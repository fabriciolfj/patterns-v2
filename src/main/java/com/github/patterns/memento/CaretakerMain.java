package com.github.patterns.memento;

public class CaretakerMain {

    public static void main(String[] args) {
        var employee = new Employee("1", "fabricio");
        var memento = new Memento();
        memento.push(employee);

        System.out.println(employee);
        employee.setName("suzana");
        System.out.println("modify " + employee);

        var bkp = memento.pop();
        System.out.println("bkp " + bkp);
    }
}
