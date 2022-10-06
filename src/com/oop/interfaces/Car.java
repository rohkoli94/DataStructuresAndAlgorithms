package com.oop.interfaces;

public class Car implements Engine,Brake,MultiMedia{
    int a;
    @Override
    public void start(){
        System.out.println("start normal car");
    };


    @Override
    public void stop(){
        System.out.println("stop normal car");

    };

    @Override
    public void acc(){
        System.out.println("accelerate normal car");

    };

    @Override
    public void brake(){
        System.out.println("brake normal car");

    };

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.start();
        car1.stop();
        car1.acc();
        car1.brake();
    }
}
