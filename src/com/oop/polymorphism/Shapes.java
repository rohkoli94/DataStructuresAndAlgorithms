package com.oop.polymorphism;

public class Shapes {
    int side = 10;

    void area(){
        System.out.println("I am inside Shapes Method");
    }
    double area(int a){
        System.out.println("Return I am inside Shapes Method ");
        return 1.0;
    }

    void parent(){
        System.out.println("s");
    }
}
