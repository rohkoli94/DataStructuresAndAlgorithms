package com.oop.singleton;

public class Singleton {

    private Singleton(){ // constructor

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance ==  null){
            instance = new Singleton();
        }
        return instance;
    }
}

