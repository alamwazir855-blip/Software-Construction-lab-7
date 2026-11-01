package com.mycompany.lab07;

public class Square extends Rectangle {

    @Override
    public void setDimensions(int w, int h) {

        if (w != h) {

            throw new IllegalArgumentException(
                    "Width and height must be equal for a square."
            );

        }

        width = w;
        height = h;

    }
}