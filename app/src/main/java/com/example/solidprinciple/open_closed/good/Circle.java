package com.example.solidprinciple.open_closed.good;

public class Circle implements Shape {

    public double radius;

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
