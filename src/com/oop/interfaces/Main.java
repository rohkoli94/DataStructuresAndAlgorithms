package com.oop.interfaces;

public class Main {

    public static void main(String[] args) {
//        Car car1 = new Car();
//        car1.start();
//        car1.stop();
//        car1.acc();
//        car1.brake();

        NiceCar car1 = new NiceCar();
        car1.start();
        car1.startMedia();
        car1.upgradeEngine();
        car1.start();

    }

}
