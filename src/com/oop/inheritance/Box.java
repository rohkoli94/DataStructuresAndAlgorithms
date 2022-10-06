package com.oop.inheritance;

public class Box {

    double length;
    double width;
    double height;

    double weight = 20;

    Box(){
        System.out.println("cons called of parent - BOX");
        this.length = -1;
        this.width = -90;
        this.height = -1;
    }

    Box(double side){
        this.length = side;
        this.width = side;
        this.height = side;
    }


    Box(Box obj){
        this.length = obj.length;
        this.width = obj.width;
        this.height = obj.height;
    }

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
}
