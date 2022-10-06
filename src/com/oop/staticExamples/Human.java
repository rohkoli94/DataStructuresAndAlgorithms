package com.oop.staticExamples;

public class Human {
    int age;
    String name;
    double salary;

    static long population;

    Human(int age, String name, double salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        Human.population+=1;
    }

    void greet(){
        System.out.println("instance greet");
        greet2();
    }

    void greet2(){
        System.out.println("instance greet 2");
    }

    static void staticGreet(){
        System.out.println("static greet");
    }


}
