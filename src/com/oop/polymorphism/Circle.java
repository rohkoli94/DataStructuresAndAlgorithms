package com.oop.polymorphism;

public class Circle extends Shapes{

    int side = 20;
    @Override
    void area(){
        System.out.println("Area of Circle is pie * r * r");
    }


    int area(double a){
        System.out.println("Return Area of Circle is pie * r * r");
        return 1;
    }

    void circlecheck(){
        System.out.println("ok");
    }

}
