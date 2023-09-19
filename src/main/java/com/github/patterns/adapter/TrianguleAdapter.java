package com.github.patterns.adapter;

public class TrianguleAdapter implements RecInterface {

    public TriInterface triInterface;

    public TrianguleAdapter(TriInterface triInterface) {
        this.triInterface = triInterface;
    }

    @Override
    public void aboutRectangle() {
        triInterface.aboutRectangle();
    }

    @Override
    public double calculeAreaOfRectangle() {
        return triInterface.calculeAreaOfTriangule();
    }
}
