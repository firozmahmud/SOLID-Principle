package com.example.solidprinciple.open_closed.good;

public class Rectangle implements Shape {

    public double width;
    public double height;

    @Override
    public double area() {
        return width * height;
    }
}
