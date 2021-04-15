package com.example.solidprinciple.open_closed.bad;

import com.example.solidprinciple.open_closed.good.Circle;
import com.example.solidprinciple.open_closed.good.Rectangle;

public class Area {

    double area;

    public double area(Object[] shapes) {
        area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                area += ((Rectangle) shape).height * ((Rectangle) shape).width;
            }

            else {
                area += ((Circle) shape).radius * ((Circle) shape).radius * Math.PI;
            }
        }

        return area;
    }
}
