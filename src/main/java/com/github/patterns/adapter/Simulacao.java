package com.github.patterns.adapter;

public class Simulacao {

    public static void main(String[] args) {
        var rectangle = new Rectangle(10, 4);

        rectangle.aboutRectangle();
        System.out.println(rectangle.calculeAreaOfRectangle());

        var triangule = new Triangule(10, 4);
        RecInterface recInterface = new TrianguleAdapter(triangule);

        recInterface.aboutRectangle();
        System.out.println(recInterface.calculeAreaOfRectangle());
    }
}
