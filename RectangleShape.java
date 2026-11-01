package com.mycompany.lab07;

public class RectangleShape implements Shape {

    private int width;
    private int height;

    public RectangleShape(int width, int height) {

        this.width = width;
        this.height = height;

    }

    @Override
    public int getArea() {

        return width * height;

    }
}