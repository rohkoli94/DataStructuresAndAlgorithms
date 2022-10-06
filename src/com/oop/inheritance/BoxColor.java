package com.oop.inheritance;

public class BoxColor extends WeightBox{

    public BoxColor() {
    }

    public BoxColor(double length, double width, double height, double weight) {
        super(length, width, height, weight);
    }

    public BoxColor(WeightBox obj) {
        super(obj);
    }
}
