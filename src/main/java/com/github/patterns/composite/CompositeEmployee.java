package com.github.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeEmployee implements IEmployee {

    private int employeeCount = 0;
    private String name;
    private String dept;
    private List<IEmployee> controls;

    public CompositeEmployee(final String name, final String dept) {
        this.name = name;
        this.dept = dept;
        controls = new ArrayList<>();
    }

    public void addEmployee(final IEmployee e) {
        controls.add(e);
    }

    public void removeEmployee(final IEmployee e) {
        controls.remove(e);
    }

    @Override
    public void printStructures() {
        System.out.println(this.name + " works in  " + this.dept);
        controls.forEach(IEmployee::printStructures);
    }

    @Override
    public int getEmployeeCount() {
        return controls.size();
    }
}
