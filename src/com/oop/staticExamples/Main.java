package com.oop.staticExamples;

public class Main {

    public static void main(String[] args) {
        Human h1 = new Human(21,"rohit",1000);
        Human h2 = new Human(22,"brady",30000);

        System.out.println(Human.population);
        System.out.println(Human.population);

        h1.greet();
    }


}
