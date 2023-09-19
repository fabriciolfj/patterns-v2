package com.github.patterns.adapter;

public class Triangule implements TriInterface {

    public double base;
    public double height;

    public Triangule(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void aboutRectangle() {
        System.out.println("Triangule object with base " + this.base + " unit and height: " + this.height + " unit.");
    }

    @Override
    public double calculeAreaOfTriangule() {
        return 0.5 * base * height;
    }
}
