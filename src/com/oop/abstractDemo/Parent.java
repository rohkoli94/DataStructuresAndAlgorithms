package com.oop.abstractDemo;

public abstract class Parent {

    int n;
    static int p = 10;

    final int VALUE = 10;

    public Parent(){
        this.n = 10;
    }
    public Parent(int n, int p){
        this.n = 10;
        this.p = 35;
    }

    public abstract void career();
    public abstract void skills(int n);


    public static void test(){
        System.out.println("hello test");
    }
}
