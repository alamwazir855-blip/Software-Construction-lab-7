package com.mycompany.lab07;

public class DataBox<T> {

    private T value;

    public DataBox(T value) {

        this.value = value;

    }

    public T getValue() {

        return value;

    }
}