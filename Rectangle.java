package com.mycompany.lab07;

public class Rectangle {

    protected int width;
    protected int height;

    public void setDimensions(int w, int h) {

        width = w;
        height = h;

    }

    public int getArea() {

        return width * height;

    }
}