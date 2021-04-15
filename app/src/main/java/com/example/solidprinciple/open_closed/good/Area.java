package com.example.solidprinciple.open_closed.good;

public class Area {

    double area;

    public double area(Shape[] shapes) {
        area = 0;
        for (Shape shape : shapes) {
            area += shape.area();
        }

        return area;
    }
}
